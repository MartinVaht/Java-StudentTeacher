package data;

import java.time.ZonedDateTime;


public interface Person {
    String  getFirstName() ;
    String getLastName();
    String getPreferredName();
    ZonedDateTime getDateOfBirth();
    int getAge();
    String sayHello();
}
