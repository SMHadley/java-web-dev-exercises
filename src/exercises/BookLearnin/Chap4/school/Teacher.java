package exercises.BookLearnin.Chap4.school;

import java.util.*;

public class Teacher {
    // first name
    private String firstName;
    //last name;
    private String lastName;
    //subject
    private String subject;
    //years teaching
    private int yearsTeaching;

    //Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}
