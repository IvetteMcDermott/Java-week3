package simpleAdditionApp;

import javax.swing.JOptionPane;

public class simpleAdditionApp {
    public static void main(String[] args) {

        /* Fill in the gaps in code by replacing the **** sections */
        // vars
        int x;
        int y;
        int ans;
        // objects

        simpleAddition add;
        add = new simpleAddition();
        // inputs
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
        // set
        add.setX(x);
        add.setY(y);
        // compute
        add.computerAns();
        // get
        ans = add.getAns();
        // output
        // System.out.println(ans);
        JOptionPane.showMessageDialog(null, "The result is " + ans);

    }
}