import java.io.FileWriter;
import java.io.IOException;
import java. util. Arrays;

public class HW_002_task1 {
    public static void main(String[] args) throws IOException {
        //Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

        bubbleSortMetod();

    }
    private static void bubbleSortMetod() throws IOException
    {
        int[] array = {9, 4, 8, 3, 1, 9 , 0, 8};
        FileWriter wrightToFile = new FileWriter("log.txt");
        resultArray(array, wrightToFile);
        System.out.print(Arrays.toString(array));
        wrightToFile.close();
    }

    private static void resultArray(int[] array, FileWriter wrightToFile) throws IOException {
        boolean isElementSwaped = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int number = array[i];
                array[i] = array[i + 1];
                array[i + 1] = number;
                isElementSwaped = true;
            }
            java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
            wrightToFile.write(currentDateTime + ": " + Arrays.toString(array) + "\n");
        }
        if (isElementSwaped) {
            resultArray(array, wrightToFile);
        }
    }
}
