package seminar_004;

import java.util.LinkedList;

public class HW_004_task1 {
    
    public static void revertLL(LinkedList<Object> ll) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add("One");
        linkedList.add(2);
        linkedList.add("Two");
        linkedList.add('<');
        
        for (int i = 0; i < linkedList.size() / 2; i++) {
            Object temp = linkedList.get(i);
            linkedList.set(i, linkedList.size() - i);
            linkedList.set(linkedList.size() - i, temp);
        }
        System.out.println(linkedList);
    }
}
