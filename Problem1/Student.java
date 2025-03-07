public class Student extends Person {
    protected String myIdNum;
    protected double myGPA;

    public Student(String name, int age, String gender, String id, double gpa) {
        super(name, age, gender);
        this.myIdNum = id;
        this.myGPA = gpa;
    }

    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    public void setIdNum(String id) {
        this.myIdNum = id;
    }

    public void setGPA(double gpa) {
        this.myGPA = gpa;
    }

    public String toString() {
        return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA;
    }
}