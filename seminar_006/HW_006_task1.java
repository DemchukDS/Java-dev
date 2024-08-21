package seminar_006;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HW_006_task1 {
    public static Map<String, List<String>> phoneNumberByName = new HashMap<>();
    public static Scanner inputScanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите Имя человека: ");
            String contactName = inputScanner.nextLine();
            if ("q".equalsIgnoreCase(contactName)) {
                break;
            }
            System.out.print("Введите номер телефона человека: ");
            String phoneNumber = inputScanner.nextLine();
            if ("q".equalsIgnoreCase(phoneNumber)) {
                break;
            }
            
            findPhoneBook(contactName, phoneNumber);
        }
        outputNumbersBook();
    }
    private static void findPhoneBook(String contactName, String phoneNumber){
        
        if (!phoneNumberByName.containsKey(contactName)) {
            phoneNumberByName.put(contactName, new ArrayList<String>());
        }
        phoneNumberByName.get(contactName).add(phoneNumber);
    }
    private static void outputNumbersBook() {
        List<Integer> numbers = new ArrayList<>();
        Set<String> names = new HashSet<>();
        for (String key : phoneNumberByName.keySet()) {
            int numberOfPhoneNumbers = phoneNumberByName.get(key).size();
            numbers.add(numberOfPhoneNumbers);
            names.add(numberOfPhoneNumbers + "-" + key);
        }
        Collections.sort(numbers, Collections.reverseOrder());
        for (int number : numbers) {
            for (String name : names) {
                if (name.contains(number + "")) {
                    String[] nameOfPerson = name.split("-");
                    System.out.println(nameOfPerson[1] + " " + phoneNumberByName.get((nameOfPerson[1])));
                }
            }
        }
    }
}
