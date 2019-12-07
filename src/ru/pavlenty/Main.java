package ru.pavlenty;

public class Main {

    public static void main(String[] args) {
        Calculator c = new Calculator(6,7);
        c.sum();

        Calculator c1 = new Calculator();
        c1.setX(10);
        c1.setY(20);
        c1.sum();

        MiniCalculator mini = new MiniCalculator();
        mini.setX(80);
        mini.setY(90);
        mini.sum();
        mini.calculate(9,9);

        Calculable ccc = new Calculable();

        Calculable ccc2 =
                (b, d) -> ((b+ d +900)/8.9)*Math.PI;
        ccc2.calculate(9,9);

        Calculable ccc3 = (b, d) -> 0;

        Something s = () -> 0;
        s.bbb();

        NNN p = new NNN() {
            @Override
            public void mmm() {

            }
        };

    }
}
interface NNN {
    void mmm();
}