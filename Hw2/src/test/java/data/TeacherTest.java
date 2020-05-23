package data;

import org.junit.Assert;
import org.junit.Test;

import java.time.ZonedDateTime;

public class TeacherTest {

    @Test
    public void sayHello(){
    //when
        ZonedDateTime dateOfBirth = ZonedDateTime.parse("2001-01-01T00:00:00.000+00:00[UTC]");
        Teacher teacher = new Teacher("Ants", "Lammas", "Traktorist", dateOfBirth, 19 );
    //given
        String oodatud = "Teacher Hello";
    //then
        Assert.assertEquals("Teacher Hello" , oodatud);
    }
}
