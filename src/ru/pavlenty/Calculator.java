package ru.pavlenty;

public class Calculator {
    private int x;
    private int y;

    public void setX(int x_) {
        this.x = x_;
    }

    public void setY(int y_) {
        this.y = y_;
    }

    Calculator() {

    }
    Calculator(int xx, int yy) {
        this.x = xx;
        this.y = yy;
    }

    public int sum() {
        return x+y;
    }

    public int mult() {
        return x*y;
    }

}
