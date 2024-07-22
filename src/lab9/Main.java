package lab9;

import java.util.*;

import static java.lang.System.currentTimeMillis;
import static lab9.Lists.numbersPicking;
import static lab9.Lists.randomNumbers;
import static lab9.duplicates.dublicateDeleter;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Volvo");
        list.add("Mercedes");
        list.add("Volvo");
        list.add("BMW");
        list.add("Volvo");
        list.add("Mercedes");
        list.add("Volvo");
        list.add("Mercedes");
        list.add("BMW");
        list.add("Audi");
        dublicateDeleter(list);
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(1);
        ints.add(2);
        ints.add(4);
        ints.add(8);
        ints.add(1);
        ints.add(18);
        ints.add(8);
        dublicateDeleter(ints);

        //speed testing
        System.out.println("Время начала: " + currentTimeMillis());
        ArrayList<Integer> list2 = new ArrayList<>();
        randomNumbers(list2);
        numbersPicking(list2);
        System.out.println("Время конца: " + currentTimeMillis());
        System.out.println("Время начала: " + currentTimeMillis());
        LinkedList<Integer> linkedList = new LinkedList<>();
        randomNumbers(linkedList);
        numbersPicking(linkedList);
        System.out.println("Время конца: " + currentTimeMillis());


        //gamers
        Scanner scanner = new Scanner(System.in);
        Map<User, Integer> playMap = new HashMap<>();
        System.out.println("Введите имя: ");
        playMap.put(new User("John"), 12345);
        playMap.put(new User("Mike"), 1234);
        playMap.put(new User("Sam"), 123);
        String searchName = scanner.nextLine();
        for (User user : playMap.keySet()) {
            if (user.getName().equals(searchName)) {
                Integer userPoints = playMap.get(user);
                System.out.println(userPoints);
                return;
            }
        }
        System.out.println("User not found");
    }
}
