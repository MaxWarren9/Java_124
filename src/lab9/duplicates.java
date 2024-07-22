package lab9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicates {
    public static <T> void dublicateDeleter(List<T> list) {
        Set<T> uniqueObjects = list.stream().collect(Collectors.toSet());
        System.out.println(uniqueObjects);
// Set <Object> uniques = new HashSet<>(list);
        //set.add()
    }
}
