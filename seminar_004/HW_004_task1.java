package seminar_004;

import java.util.LinkedList;

public class HW_004_task1 {
    
    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add("One");
        linkedList.add(2);
        linkedList.add("Two");
        linkedList.add('<');
        linkedList.add('<');
        revertLL(linkedList);
    }

    public static void revertLL(LinkedList<Object> ll) {
        for (int i = 0; i < ll.size() / 2; i++) {
            Object temp = ll.get(i);
            ll.set(i, ll.get(ll.size() - i - 1));
            ll.set(ll.size() - i - 1, temp);
        }
        System.out.println(ll);
    }
}
