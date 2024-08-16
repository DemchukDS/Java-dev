import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HW_003_task3 {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {4, 2, 7, 5, 1, 3, 8, 6, 9, 1};
        analyzeNumbers(array);
    }

    public static void analyzeNumbers(Integer[] arr) {
        List<Integer> newIntegers = new ArrayList<>();
        for (Integer number : arr) {
            newIntegers.add(number);
        }
        newIntegers.sort(null);
        System.out.println(newIntegers);
        System.out.println("Minimum is " + Collections.min(newIntegers));
        System.out.println("Maximum is " + Collections.max(newIntegers));
        double averageValue = 0;
        for (Integer number : newIntegers) {
            averageValue = averageValue + number;
        }
        averageValue /= newIntegers.size();
        System.out.println("Average is " + averageValue);
    }
}
