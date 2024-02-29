package WorkerWage;

public class wage {
    // vars
    private double wage;
    private int hours;
    private double wageByHour;
    private double yearWage;

    // constructor

    // set
    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    // compute
    public void computeYearWage() {
        yearWage = wage * 12;
    }

    public void computeWageByHour() {
        wageByHour = wage / hours;
    }

    // get
    public double getWageByHour() {
        return wageByHour;
    }

    public double getYearWage() {
        return yearWage;
    }
}
