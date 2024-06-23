package lab4;

public class isSorted {
    public static void SortedOrNot(int[] array) {
        boolean sorted = true;
        for (int i = 0; i < array.length-1; i++)
            if (array[i] >= array[i + 1]) {
                sorted = false;}
        if (sorted == true) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 22, 13, 27};
        SortedOrNot(array);
    }
}
