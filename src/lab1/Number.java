package lab1;

public class Number {
    public Number(double num) {
        double result = (num / 10) / 10;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Number number = new Number(10500);
    }
}

