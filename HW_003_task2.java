import java.util.ArrayList;
import java.util.List;

public class HW_003_task2 {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        removeEvenNumbers(array);
    }


    public static void removeEvenNumbers(Integer[] arr) {
        List<Integer> newIntegerList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                newIntegerList.add(arr[i]);
            }
        }
        System.out.println(newIntegerList);
    }
}
