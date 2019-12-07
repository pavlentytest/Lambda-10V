package ru.pavlenty;

public class MiniCalculator extends Calculator
implements Calculable {

    @Override
    public double calculate(int b, int c) {
        return ((b+c/(b+c))-100)*900;
    }
}
