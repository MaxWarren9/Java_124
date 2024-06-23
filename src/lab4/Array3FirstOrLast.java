package lab4;

import java.util.Arrays;
import java.util.Scanner;

/*5.	Напишите программу, чтобы проверить, появляется ли число 3
        как первый или последний элемент массива целых чисел.
        Длина массива должна быть больше или равна двум. Пример вывода:
        array = 3, -3, 7, 4, 5, 4, 3
        true
*/
public class Array3FirstOrLast {

    public static boolean Test(int[] array) {
        if (array.length >= 2) {
            if (array[0] == 3 || array[array.length - 1] == 3) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Test(new int[]{3, -3, 7, 4, 5, 4, 2}));
    }
}
