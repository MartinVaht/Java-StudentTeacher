package util;

import data.Course;
import data.Student;

import java.util.List;

public class Util {


    public static void tudengiNimed(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getFirstName());

        }
    }
}





//n'ide

//    public List<String> showAllTeachersNames() {
//
//        List<String> teachersNames = new List<String>();
//
//        for (Course course : this.courses) {
//            teachersNames.add(course.getTeacher().getLastName());
//        }
//
//        return teachersNames;