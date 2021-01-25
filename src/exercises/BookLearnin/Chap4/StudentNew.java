package exercises.BookLearnin.Chap4;

public class StudentNew {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    /*this is a getter*/
    public String getName(){
        return name;

    }
    /*this a setter*/
    /*Prefixing a parameter that is intended to set an instance variable with 'a'
    is a relatively common convention, and one that we’ll adopt to avoid shadowing
    and having to use 'this.' in our setters. You can think of the 'a' as denoting
    the “argument” version of the variable.*/
    public void setName(String aName) {
        name = aName;
    }
}





