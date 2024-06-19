package lab2;

import java.util.Arrays;

/*
Создать класс Calculator. У него должны быть методы:
-	Сумма
-	Деление
-	Умножение
-	Вычитание
Все методы должны быть перегружены и работать с
    тремя типами данных- double, long и int.
 */
public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.Add(39.0,99.2));
        System.out.println(calculator.Divide(39.0,99.2));
        System.out.println(calculator.Multiply(39.0,99.2));
        System.out.println(calculator.Extract(39.0,99.2));
    }

    static double Add(double num1, double num2) {
        return num1 + num2;
    }

    static int Add(int num1, int num2) {
        return num1 + num2;
    }

    static long Add(long num1, long num2) {
        return num1 + num2;
    }

    static double Divide(double num1, double num2) {
        return num1 / num2;
    }

    static int Divide(int num1, int num2) {
        return num1 / num2;
    }

    static long Divide(long num1, long num2) {
        return num1 / num2;
    }

    static double Multiply(double num1, double num2) {
        return num1 * num2;
    }

    static int Multiply(int num1, int num2) {
        return num1 * num2;
    }

    static long Multiply(long num1, long num2) {
        return num1 * num2;
    }

    static double Extract(double num1, double num2) {
        return num1 - num2;
    }

    static int Extract(int num1, int num2) {
        return num1 - num2;
    }

    static long Extract(long num1, long num2) {
        return num1 - num2;
    }
}
