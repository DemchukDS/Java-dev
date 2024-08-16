package seminar_004;

import java.util.LinkedList;
import java.util.Scanner;

public class task_002 {
    /*Реализовать консольное приложение, которое:
    1. Принимает от пользователя и “запоминает” строки.
    2. Если введено print, выводит строки так, чтобы последняя введенная
    была первой в списке, а первая - последней.
    3. Если введено revert, удаляет предыдущую введенную строку из памяти */

    public static void main(String[] args) {
        System.out.println("Enter the strings: ");
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> tempLinkedList = new LinkedList<>();
        while (true) {
            String enterString = scanner.next();
            if ("q".equalsIgnoreCase(enterString)) {
                break;
            } else {
                if ("Print".equalsIgnoreCase(enterString)) {
                    String tempString = tempLinkedList.get(0);
                    tempLinkedList.set(0, tempLinkedList.getLast());
                    tempLinkedList.set(tempLinkedList.size()-1, tempString);
                    System.out.println(tempLinkedList);
                }
                else if ("revert".equalsIgnoreCase(enterString)) {
                    tempLinkedList.removeLast();
                    System.out.println(tempLinkedList);
                } else {
                    tempLinkedList.add(enterString);
                }
            }
        }
    }
}
