package lab4;
import java.util.Arrays;
public class ChangeFirstAndLast {
    public static void Changer(int[] array) {
        System.out.println("Array 1:" + Arrays.toString(array));
        int i = array[0];
        int j = array[array.length-1];
        array[0] = j;
        array[array.length - 1] = i;
        System.out.println("Array 2:" + Arrays.toString(array));
    }
    public static void main(String[] args){
        int[] array = {1,2,3,4};
        Changer(array);
    }

}
