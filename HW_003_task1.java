import java.util.ArrayList;
import java.util.List;

public class HW_003_task1 {
    public static void main(String[] args) {
        int[] array = new int[] {2, 123, 23, 67, 891, -12, 33, 10};
        inputArray(mergeSort(array));
    }

    private static void inputArray(int array[]) {
        for (Integer number : array) {
            System.out.print(number + " ");
        }
    }

    public static int[] mergeSort(int[] array) {
        List<Integer> tempList = new ArrayList<>();

        for(int i = 0; i < array.length; i++) {
            tempList.add(array[i]);
        }

        tempList.sort(null);
        int[] resultArray = new int[tempList.size()];

        for (int j = 0; j < tempList.size(); j++) {
            resultArray[j] = tempList.get(j);
        }

        return resultArray;
    }
}