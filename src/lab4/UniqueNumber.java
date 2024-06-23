package lab4;

import java.util.Arrays;

public class UniqueNumber {
    public static void sorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int a = array[i];
                    int b = array[j];
                    array[i] = b;
                    array[j] = a;
                }
            }
        }
    }

    public static void uniqueSeek(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 3, 3, 2, 2, 2, 4};
        sorting(array);
        uniqueSeek(array);
    }
}
