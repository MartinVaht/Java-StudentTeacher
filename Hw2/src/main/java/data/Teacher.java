package data;

import java.time.ZonedDateTime;

public class Teacher extends PersonImpl {


    public Teacher(String firstName, String lastName, String preferredName, ZonedDateTime dateOfBirth, int age) {
        super(firstName, lastName, preferredName, dateOfBirth, age);
    }

    @Override
    public String sayHello() {
        return "Teacher Hello" ;
    }
}
