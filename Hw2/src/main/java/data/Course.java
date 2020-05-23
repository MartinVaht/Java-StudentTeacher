package data;

import java.time.ZonedDateTime;

public class Course {
    private String name;
    private int eap;
    private ZonedDateTime startDate;
    private ZonedDateTime endDate;
    private Teacher teacher;

    public Course(String name, int eap, ZonedDateTime startDate, ZonedDateTime endDate, Teacher teacher) {
        this.name = name;
        this.eap = eap;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEap() {
        return eap;
    }

    public void setEap(int eap) {
        this.eap = eap;
    }

    public ZonedDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(ZonedDateTime startDate) {
        this.startDate = startDate;
    }

    public ZonedDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(ZonedDateTime endDate) {
        this.endDate = endDate;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
