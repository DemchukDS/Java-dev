package seminar_004;

import java.util.LinkedList;
import java.util.Scanner;


public class task_001 {
    public static void main(String[] args) {
        // Реализовать консольное приложение, которое:
        // 1. Принимает от пользователя строку вида
        // text~num
        // 2. Нужно рассплитить строку по ~, сохранить text в связный список на
        // позицию num.
        // 3. Если введено print~num, выводит строку из позиции num в связном
        // списке и удаляет её из списка.

        System.out.println("Enter the string: (type: text~num)");
        Scanner text = new Scanner(System.in);
        String enteredString = text.nextLine();
        text.close();
        addToLinkedList(enteredString);
    }

    public static void addToLinkedList(String string) {

        String[] text = string.split("~");
        int number = Integer.parseInt(text[1]);
        LinkedList<String> tempLinkedList = new LinkedList<>();
        for (int i = 0; i < number + 10; i++) {
            tempLinkedList.add(null);
        }
        tempLinkedList.add(number, text[0]);
        System.out.println(tempLinkedList);
        if (checkForPrint(tempLinkedList, number) == true) {
            System.out.println(tempLinkedList.get(number));
            tempLinkedList.remove(tempLinkedList.get(number));
            System.out.println(tempLinkedList);
        }
    }

    public static boolean checkForPrint (LinkedList<String> string, int number) {
        if (string.get(number) != "print") {
            return true;
        }
        return false;
    }
}
