package lab5;

import java.util.Scanner;
import java.util.Arrays;

public class Invertor {
    public static void tester(String text) {
        String[] array = text.split(" ");
        for (int i = 0; i < array.length; i++) {
            StringBuilder temp = new StringBuilder(array[i]);
            array[i] = String.valueOf(temp.reverse());
        }
        String store = Arrays.toString(array);
        String prelim = String.join(" ", store);
        String result = prelim.replaceAll(",", " ");
        System.out.println(result);
    }

    public static void main(String[] args) {
        System.out.println("Введите фразу: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        tester(text);
    }
}
