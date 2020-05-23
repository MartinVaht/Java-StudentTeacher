package data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import services.PublicHolidayService;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class CourseTest {

    ZonedDateTime startDate = ZonedDateTime.parse("2020-03-01T00:00:00.000+00:00[UTC]");
    ZonedDateTime endDate = ZonedDateTime.parse("2020-03-16T00:00:00.000+00:00[UTC]");
    ZonedDateTime dateOfBirth = ZonedDateTime.parse("2001-01-01T00:00:00.000+00:00[UTC]");
    Teacher teacher = new Teacher("Ants", "Lammas", "Traktorist", dateOfBirth, 19);


    @Mock
    private PublicHolidayService publicHolidayService;

    @InjectMocks
    Course course = new Course("karjatamine", 5, startDate, endDate, teacher);

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void dayLenght() {

        //given
        long expectedResult = 11L;
        //when
        long result = course.getLength();
        //then
        assertEquals(expectedResult, result);

    }

    @Test
    public void miinusDayLenght() {
        startDate= ZonedDateTime.parse("2020-03-16T00:00:00.000+00:00[UTC]");
        endDate=ZonedDateTime.parse("2020-03-01T00:00:00.000+00:00[UTC]");
        Course course = new Course("karjatamine", 5, startDate, endDate, teacher);
        //given
        long expectedResult = 11L;
        //when
        long result = course.getLength();
        //then
        assertEquals(expectedResult, result);
    }

    @Test
    public void tööPäevad() {
//    given
        startDate = ZonedDateTime.parse("2020-03-01T00:00:00.000+00:00[UTC]");
        endDate = ZonedDateTime.parse("2020-03-16T00:00:00.000+00:00[UTC]");
        when(publicHolidayService.getPublicHolidaysOnWorkdays(startDate,endDate)).thenReturn(1);
        long expectedResult = 11L;
//    when
        long result = course.getWorkingDays();

//    then
        assertEquals(expectedResult,result);

    }

}
