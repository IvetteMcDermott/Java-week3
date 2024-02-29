package WorkerWage;

import javax.swing.JOptionPane;

public class wageApp {
    public static void main(String[] args) {
        // variables
        double wage;
        int hours;
        double wageByHour;
        double yearWage;
        // objects
        wage workerWage;
        workerWage = new wage();

        // inputs
        wage = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the wage"));
        hours = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the hours per month"));
        // set
        workerWage.setWage(wage);
        workerWage.setHours(hours);
        // compute
        workerWage.computeYearWage();
        workerWage.computeWageByHour();
        // get
        yearWage = workerWage.getYearWage();
        wageByHour = workerWage.getWageByHour();
        // output
        JOptionPane.showMessageDialog(null, "year wage " + yearWage);
        JOptionPane.showMessageDialog(null, "by hour " + wageByHour);

    }
}
