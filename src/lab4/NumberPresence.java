package lab4;

/*
6.	Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
 */
public class NumberPresence {
    public static boolean Seeker(int[] array) {
        boolean res = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 3) {
                res = true;
            } else {
                res = false;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {2, 2, 2};
        System.out.println(Seeker(array));
    }
}
