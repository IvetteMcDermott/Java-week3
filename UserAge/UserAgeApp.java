package UserAge;


import javax.swing.JOptionPane;

public class UserAgeApp {
    public static void main(String[] args) {

        // vars
        int age;
        int year;
        int bday;
        int byear;

        // objects
        UserAge userAge;
        userAge = new UserAge();
        // inputs
        age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));
        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter current year"));
        // get if the bday had happened to be more accurate
        bday = Integer.parseInt(JOptionPane.showInputDialog(null, "Was your bday already? Enter 0 if yes or 1 if no"));

        // set
        userAge.setAge(age);
        userAge.setYear(year);
        userAge.setBday(bday);

        // compute
        userAge.computeByear();

        // get
        byear = userAge.getbYear();

        // output
        JOptionPane.showMessageDialog(null, "You born on " + byear);

    }
}