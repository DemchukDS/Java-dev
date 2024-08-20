package seminar_005;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HW_005_task2 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Введите пять имён: ");
        String inputNames = name.nextLine();
        List<String> names = Arrays.asList(inputNames.split(" "));
        numberOfRepeat(names);
        System.out.println(countByName);
    }

    public static Map<String, Integer> countByName = new HashMap<>();

    private static void numberOfRepeat(List<String> names) {
        for (String element : names) {
            //element = element.toLowerCase();
            if (!countByName.containsKey(element)) {
                countByName.put(element, 0);
            }
            countByName.put(element, countByName.get(element) + 1);
        }
    }
}
