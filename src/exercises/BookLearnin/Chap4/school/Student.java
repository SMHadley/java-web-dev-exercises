package exercises.BookLearnin.Chap4.school;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    public static void main(String[] args) {

        Student me = new Student("Sandy", 001, 1, 4.0);
    }


    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);

    }   /* Getters and Setters */

    public String getName() { return this.name; }

    public void setName(String aName) { name = aName; }

    public int getStudentId() { return this.studentId; }

    private void setStudentId(int aStudentId) { studentId = aStudentId; }

    public int numberOfCredits() { return this.numberOfCredits; }

    public void setNumberOfCredits(int aNumberOfCredits) { numberOfCredits = aNumberOfCredits; }

    public double getGpa() { return this.gpa; }

    public void setGpa(double aGpa) { gpa = aGpa; }

}

