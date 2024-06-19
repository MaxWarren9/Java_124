package lab42;
/*
1.	Напишите программу, которая проверяет отсортирован
    ли массив по возрастанию. Если он отсортирован по
    возрастанию то выводится “OK”, если нет,
    то будет выводиться текст “Please, try again”
 */
public class IsSorted {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 8, 99};

        boolean isSorted = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }
}
