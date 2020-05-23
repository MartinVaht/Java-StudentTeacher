package data;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student extends PersonImpl{

    private List<Course> courses;



    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Student(String firstName, String lastName, String preferredName, ZonedDateTime dateOfBirth, int age) {
        super(firstName, lastName, preferredName, dateOfBirth, age);
    }



    public List<String> showAllTeachersNames() {

        List<String> teachersNames = new ArrayList<String>();

        for (Course course : this.courses) {
            teachersNames.add(course.getTeacher().getLastName());
        }

        return teachersNames;
    }

//    public List<String> getAllTeacherNames(){
//        return this.getCourses().stream().map(Course::getName).collect(Collectors.toList());
//    }
//


    @Override
    public String sayHello() {
        return "Student Hello" ;
    }
}
