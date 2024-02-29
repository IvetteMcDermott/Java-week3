package simpleAdditionApp;

// istantiable
public class simpleAddition {

    // declare vars
    private int x;
    private int y;
    private int ans;

    // constructor
    public simpleAddition() {
        x = 0;
        y = 0;
        ans = 0;
    }
    // set

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // computer/process

    public void computerAns() {
        ans = x + y;
    }

    // get
    public int getAns() {
        return ans;
    }

}
