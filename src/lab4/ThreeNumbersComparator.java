package lab4;
/*
4.	Напишите программу, которая принимает от пользователя три целых числа
и возвращает true, если второе число больше первого числа, а третье число
больше второго числа. Пример вывода:

Введите первое число: 5
Введите второе число: 10
Введите третье число: 15
Результат: true

 */

import java.util.Scanner;

public class ThreeNumbersComparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getNumber("Введите первое число: ", scanner);
        int num2 = getNumber("Введите второе число: ", scanner);
        int num3 = getNumber("Введите третье число: ", scanner);
        boolean result = NumberCompare(num1, num2, num3);
        System.out.println("Результат: " + result);
    }

    public static int getNumber(String str, Scanner scanner) {
        System.out.print(str);
        return scanner.nextInt();
    }

    public static boolean NumberCompare(int num1, int num2, int num3) {
        return (num1 < num2 && num2 < num3);
    }
}
