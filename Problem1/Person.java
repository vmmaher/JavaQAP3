public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }

    public String getName() {
        return myName;
    }

    public int getAge() {
        return myAge;
    }

    public String getGender() {
        return myGender;
    }

    public void setName() {
        this.myName = myName;
    }

    public void setAge() {
        this.myAge = myAge;
    }

    public void setGender() {
        this.myGender = myGender;
    }

    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}