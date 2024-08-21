package seminar_006;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class task_001 {
    /*
     * 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
    2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
    3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
     */
    public static void main(String[] args) {
        // createSomeSet(new HashSet<Integer>()); // Сортирует по Хэшу
        // createSomeSet(new LinkedHashSet<Integer>()); // Выводит в порядке в котором задали
        // createSomeSet(new TreeSet<Integer>()); // Сортирует по значению

        int[] newArray = new int[1000];
        percentageOfUniqueNumbers(findArray(newArray));
        

        /*1. Напишите метод, который заполнит массив из 1000 элементов случайными
        цифрами от 0 до 24.
        2. Создайте метод, в который передайте заполненный выше массив и с
        помощью Set вычислите процент уникальных значений в данном массиве и
        верните его в виде числа с плавающей запятой.
        Для вычисления процента используйте формулу:
        процент уникальных чисел = количество уникальных чисел * 100 / общее
        количество чисел в массиве. */
    }
    public static void createSomeSet(Set<Integer> set) {
        set.add(6);
        set.add(1);
        set.add(4);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println(set.getClass().getCanonicalName() + ": " + set);
    }

    public static int[] findArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Random randomNumber = new Random();
            array[i] = randomNumber.nextInt(0, 25);
        }
        return array;
    }

    public static void percentageOfUniqueNumbers(int[] array) {
        Set<Integer> numbers = new HashSet<>();
        for (Integer element : array) {
            numbers.add(element);
        }
        double uniqueNumberPercentage =  numbers.size() *  100.0 / array.length;
        System.out.println(Arrays.toString(array));
        System.out.println(numbers);
        System.out.println(uniqueNumberPercentage);
    }
}
