public class CollegeStudent extends Student {
    protected String myMajor;
    protected int myYear;

    public CollegeStudent(String name, int age, String id, String gender, double gpa, String major, int year) {
        super(name, age, gender, id, gpa);
        this.myMajor = major;
        this.myYear = year;
    }

    public String getMajor() {
        return myMajor;
    }

    public int getYear() {
        return myYear;
    }

    public void setMajor(String major) {
        this.myMajor = major;
    }

    public void setYear(int year) {
        this.myYear = year;
    }

    public String toString() {
        return super.toString() + ", major: " + myMajor + ", year: " + myYear;
    }
}
