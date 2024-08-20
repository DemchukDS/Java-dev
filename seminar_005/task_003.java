package seminar_005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task_003 {
    /*Написать программу, определяющую правильность расстановки скобок в выражении.
    Пример 1: a+(d*3) - истина
    Пример 2: [a+(1*3) - ложь
    Пример 3: [6+(3*3)] - истина
    Пример 4: {a}[+]{(d*3)} - истина
    Пример 5: <{a}+{(d*3)}> - истина
    Пример 6: {a+]}{(d*3)} - ложь */

    public static Map<Character, Character> symbolBySymbol = new HashMap<>();
    public static void main(String[] args) {
        String inputString = "{a+]}{(d*3)}";

        symbolBySymbol.put('}', '{');
        symbolBySymbol.put(']', '[');
        symbolBySymbol.put(')', '(');
        symbolBySymbol.put('>', '<');
        isCorrect(inputString);
    }

    private static boolean isCorrect(String input) {
        List<Character> symbolList = new ArrayList<>();
        char[] charArray = input.toCharArray();
        for (char element : charArray) {
            if (symbolBySymbol.containsValue(element)) {
                symbolList.add(element);
            } else if (symbolBySymbol.containsKey(element)) {
                if (symbolList.isEmpty() || symbolList.removeLast() != symbolBySymbol.get(element)) {
                    System.out.println(false);
                    return false;
                }
            }
        }
        boolean empty = symbolList.isEmpty();
        System.out.println(empty);
        return empty;
    }
}
