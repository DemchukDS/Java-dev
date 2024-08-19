package seminar_005;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class task_002 {
    /*Взять набор строк, например^
    Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.

Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
Строки с одинаковой длиной не должны “потеряться”. */

    public static void main(String[] args) {
        String input = "Мороз и солнце день чудесный, Еще ты дремлешь, друг прелестный? Пора красавица, проснись!";
        System.out.println(input);
        input = input.replaceAll("\\.", "");
        input = input.replaceAll(",", "");
        input = input.replaceAll("\\?", "");
        input = input.replaceAll("!", "");
        Map<Integer, List<String>> wordsByLength = new TreeMap<>();
        String[] split = input.split(" ");
        for (String stringOfStih : split) {
            Integer stringLength = stringOfStih.length();
            if (!wordsByLength.containsKey(stringLength)) {
                wordsByLength.put(stringLength, new ArrayList<String>());
            }
            wordsByLength.get(stringLength).add(stringOfStih);
        }
        System.out.println(wordsByLength);
    }
}
