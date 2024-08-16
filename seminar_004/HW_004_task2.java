package seminar_004;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class HW_004_task2 {
    
    private static LinkedList<Integer> enqueueElements = new LinkedList<>();
    public static void main(String[] args) {
        enqueueElements.add(31);
        enqueueElements.add(24);
        enqueueElements.add(35);
        enqueueElements.add(31);
        enqueueElements.add(1);
        enqueueElements.add(66);
        enqueueElements.add(19);
        enqueueElements.add(6);

        enqueue(1);
        System.out.println(dequeue());
        System.out.println(first());
        System.out.println(getElements());
        
    }

    public static void enqueue(int element){
        enqueueElements.addLast(element);
        System.out.println(enqueueElements);
    }
    public static int dequeue(){
        int number = enqueueElements.getFirst();
        enqueueElements.removeFirst();
        return number;
    }
    public static int first(){
        return enqueueElements.getFirst();
    }
    public static LinkedList<Integer> getElements() {
        return enqueueElements;
    }
}
