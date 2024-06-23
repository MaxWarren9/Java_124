package lab4;

import java.util.Scanner;

/*
3.	Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true,
    если сумма равна третьему целому числу. Пример вывода:

Введите первое число: 5
Введите второе число: 10
Введите третье число: 15
Результат: true
 */

public class EqualChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getNumber("Введите первое число: ", scanner);
        int num2 = getNumber("Введите второе число: ", scanner);
        int num3 = getNumber("Введите третье число: ", scanner);
        boolean result = sumEquals(num1, num2, num3);
        System.out.println("Результат: " + result);
    }

    public static int getNumber(String str, Scanner scanner) {
        System.out.print(str);
        return scanner.nextInt();
    }

    public static boolean sumEquals(int num1, int num2, int num3) {
        return (num1 + num2) == num3;
    }
}
