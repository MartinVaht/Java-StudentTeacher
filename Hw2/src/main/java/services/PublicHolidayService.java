package services;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;





public class PublicHolidayService {

    private static final String COUNTRY_CODE = "EE";
    private static final String API_URL = "https://date.nager.at/api/v2/PublicHolidays/";

    public int getPublicHolidaysOnWorkdays(ZonedDateTime algusDate, ZonedDateTime loppDate){
        List<ZonedDateTime>result = new ArrayList<>();
        String composed_url = API_URL + String.valueOf(loppDate.getYear()) + "/" + COUNTRY_CODE;
        int countOfHolidays = 0;
        try {
            URL url = new URL(composed_url);
            URLConnection yc = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String sisend;
            String dateString;

            while ((sisend = in.readLine()) != null) {
                JSONArray arr = new JSONArray(sisend);
                for (int i = 0; i < arr.length(); i++) {
                    JSONObject jsonObject = arr.getJSONObject(i);
                    dateString = jsonObject.getString("date");
                    LocalDate date = LocalDate.parse(dateString);
                    ZonedDateTime zoned_result = date.atStartOfDay(ZoneId.of("UTC"));
                    result.add(zoned_result);
                }
            }

            in.close();
            for (ZonedDateTime zonedDateTime : result) {

                if((zonedDateTime.isAfter(algusDate) || zonedDateTime.isEqual(algusDate))
                        && zonedDateTime.isBefore(loppDate)) {
                    int dayOfWeek = zonedDateTime.getDayOfWeek().getValue();
                    if ((dayOfWeek > 1) && (dayOfWeek < 7)) {
                        countOfHolidays += 1;


                    }
                }
            }
        }
        catch (Exception ex){
            // mis see alas on?
        }
        return countOfHolidays;
    }
}