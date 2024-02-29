package UserAge;

public class UserAge {
    // vars
    private int age;
    private int year;
    private int bday;
    private int byear;

    // constructor
    public UserAge() {

        age = 0;
        year = 0;
        bday = 0;
        byear = 0;
    }

    // set
    public void setAge(int age) {
        this.age = age;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBday(int bday) {
        this.bday = bday;
    }

    // compute
    public void computeByear() {
        byear = year - age - bday;
    }

    // get
    public int getbYear() {
        return byear;
    }

}
