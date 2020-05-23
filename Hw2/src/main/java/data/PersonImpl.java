package data;

import java.time.ZonedDateTime;

public class PersonImpl implements Person {
   private String firstName;
   private String lastName;
   private String preferredName;
   private ZonedDateTime dateOfBirth;
   private int age;

    public PersonImpl(String firstName, String lastName, String preferredName, ZonedDateTime dateOfBirth, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.preferredName = preferredName;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public ZonedDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(ZonedDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String sayHello(){
       return null;
    }
}
