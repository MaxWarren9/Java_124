package lab1;

public class Multifloat {
    public void Multifloat(double a, double b, double c){
        double result = a * b * c;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Multifloat multifloat = new Multifloat();
        multifloat.Multifloat(3.6, 4.1, 5.9);
    }
}
