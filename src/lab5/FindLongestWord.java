package lab5;

import java.util.Scanner;

public class FindLongestWord {
    static String longestWord(String text) {
        String[] words = text.split(" ");
        String str = "";
        for (String word : words) {
            if (word.length() > str.length()) {
                str = word;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String v = longestWord(text);
        System.out.println(v);
    }
}
