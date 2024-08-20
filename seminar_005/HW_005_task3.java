package seminar_005;

import java.util.ArrayList;
import java.util.List;


public class HW_005_task3 {

    public static void main(String[] args) {
        int[] array = new int[] {5, -11, 12, 6, 4, 19};
        heapSort(array, array.length);

    }
    
    public static void buildTree(int[] tree, int sortLength) {
        
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        buildTree(sortArray, sortLength);
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < sortLength; i++) {
            arrayList.add(sortArray[i]);
        }
        arrayList.sort(null);
        System.out.println(arrayList);
    }
}
