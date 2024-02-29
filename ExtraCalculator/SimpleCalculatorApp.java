package ExtraCalculator;

import java.util.Scanner;

public class SimpleCalculatorApp {
    public static void main(String[] args) {
        // scanner
        Scanner input = new Scanner(System.in);

        // vars
        double num1, num2, result;
        char operator;

        // objects
        SimpleCalculator sCalculator;
        sCalculator = new SimpleCalculator();

        // inputs
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        // close inputs
        input.close();

        // set
        sCalculator.setnum1(num1);
        sCalculator.setnum2(num2);
        sCalculator.setoperator(operator);

        // compute
        sCalculator.computeOperation();

        // get
        num1 = sCalculator.getnum1();
        num2 = sCalculator.getnum2();
        operator = sCalculator.getoperator();
        result = sCalculator.getresult();

        // output
        System.out.println("Result: " + result);
    }
}