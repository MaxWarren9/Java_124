package lab9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static java.lang.System.currentTimeMillis;

public class Lists {
    public static void randomNumbers(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add((int) (Math.random() * 1000));
        }
    }

    public static void numbersPicking(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int randomIndex = random.nextInt(list.size());
        }
        System.out.println(list.size());
        }

}