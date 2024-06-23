package lab4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayLength {

    public static void ArraySize() {
        System.out.println("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Array length:" + array.length);
        System.out.println("Введите число:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        ArraySize();
    }
}
