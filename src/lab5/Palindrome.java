package lab5;

import java.util.Scanner;

public class Palindrome {
    public static void tester(String text) {
        StringBuilder str = new StringBuilder(text);
        str.reverse();
        if (str.compareTo(new StringBuilder(text)) == 0) {
            System.out.println(true);
        }else
            System.out.println(false);
    }
    public static void main(String[] args) {
        System.out.println("Введите слово: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        tester(text);
    }
}
