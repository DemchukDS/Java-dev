package seminar_005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*Создать структуру для хранения Номеров паспортов и Фамилий
сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов */

public class task_001 {

    public static Map<Integer, String> passportData;

    public static void main(String[] args) {
        passportData = new HashMap<>();
        passportData.put(123456, "Ivanov");
        passportData.put(321456, "Vasiliev");
        passportData.put(234561, "Petrov");
        passportData.put(234432, "Ivanov");
        passportData.put(654321, "Petrova");
        passportData.put(345678, "Ivanov");
        
        Scanner in = new Scanner(System.in);
        while (true) {
            String input = in.next();
            if (!passportData.containsValue(input)) {
                break;
            }
            if ("q".equalsIgnoreCase(input)) {
                System.exit(0);
            }
            List<Integer> array = new ArrayList<>();
            for (Integer keyNumber : passportData.keySet()) {
                String newName = passportData.get(keyNumber);
                if (newName.equalsIgnoreCase(input)) {
                    array.add(keyNumber);
                }
            }
            System.out.println(array);
        }
    }
}