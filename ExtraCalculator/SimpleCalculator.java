package ExtraCalculator;

public class SimpleCalculator {

    // vars
    private double num1;
    private double num2;
    private double result;
    private char operator;

    // constructor
    public SimpleCalculator() {
        result = 0;
    }

    // set
    public void setnum1(double num1) {
        this.num1 = num1;
    }

    public void setnum2(double num2) {
        this.num2 = num2;
    }

    public void setoperator(char operator) {
        this.operator = operator;
    }

    public void setresult(double result) {
        this.result = result;
    }

    // compute
    public void computeOperation() {

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }
    }

    // get

    public double getnum1() {
        return num1;
    }

    public double getnum2() {
        return num2;
    }

    public double getresult() {
        return result;
    }

    public char getoperator() {
        return operator;
    }

}