package seminar_005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HW_005_task1 {
    /*
    add("Alice", 123456);   
    add("Alice", 789012);   
    add("Bob", 789012); 
    */

    public static Map<String, List<Integer>> phoneNumberByName= new TreeMap<>();
    public static void main(String[] args) {
        // Map<String, Integer> phoneNumberByName= new HashMap<>();
        // phoneNumberByName.put("Alice", 123456);
        // phoneNumberByName.put("Alice", 789012);
        // phoneNumberByName.put("Bob", 789012);
        // System.out.println(phoneNumberByName);
        fillPhoneBook("Alice", 123456);
        fillPhoneBook("Alice", 789012);
        fillPhoneBook("Bob", 789012);

        System.out.println(phoneNumberByName);
    }

    public static void fillPhoneBook(String name, Integer phoneNumber) {
        if (!phoneNumberByName.containsKey(name)) {
            phoneNumberByName.put(name, new ArrayList<Integer>());
        }
        phoneNumberByName.get(name).add(phoneNumber);
    }
}
