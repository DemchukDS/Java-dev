import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class seminar_003 {
    public static void main(String[] args) {
        // Даны следующие строки, cравнить их с помощью == и метода equals() класса Object

        // String s1 = "hello";
        // String s2 = "hello";
        // String s3 = s1;
        // String s4 = "h" + "e" + "l" + "l" + "o";
        // String s5 = new String("hello");
        // String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        // List<String> temp = new ArrayList<>();
        // temp.add(s1);
        // temp.add(s2);
        // temp.add(s3);
        // temp.add(s4);
        // temp.add(s5);
        // temp.add(s6);

        // for (int i = 0; i < temp.size(); i++) {
        //     for (int j = 0; j < temp.size(); j++) {
        //         boolean flag = temp.get(i) == temp.get(j);

        //         System.out.println((i + 1) + " " + (j + 1) + " == " + flag);
        //         System.out.println((i + 1) + " " + (j + 1) + " equals " + temp.get(i).equals(temp.get(j)));
        //         System.out.println("-------------------");
        //     }
        // }



        // Заполнить список десятью случайными числами.
        // Отсортировать список методом sort() и вывести его на
        // экран.
        
        // List<Integer> myIntegerList = new ArrayList<Integer>();
        // initListValues(myIntegerList);
        // System.out.println(myIntegerList);
        // Collections.sort(myIntegerList);
        // System.out.println(myIntegerList);



        // Заполнить список названиями планет Солнечной
        // системы в произвольном порядке с повторениями.
        // Вывести название каждой планеты и количество его
        // повторений в списке

        List<String> planets = new ArrayList();
        planets.add("Меркурий");
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Земля");
        planets.add("Меркурий");
        planets.add("Уран");

        //System.out.println("Список планет: " + planets);
        // outputList(planets);



        // Пройти по списку из предыдущего задания и удалить
        // повторяющиеся элементы.
        
        deleteDuplicatesValues(planets);

    }

    private static void initListValues(List<Integer> myIntegerList) {
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int number = random.nextInt(i);
            myIntegerList.add(number);
        }
    }

    private static void outputList(List<String> planets) {
        List<String> newList = new ArrayList<>();
        for (String planet : planets) {
            if (!newList.contains(planet)) {
                newList.add(planet);
            }
        }
        for (int i = 0; i < newList.size(); i++) {
            int index = Collections.frequency(planets, newList.get(i));
            System.out.print(newList.get(i) + " повторяется " + index + " раз/a.\n");
        }
    }

    private static void deleteDuplicatesValues(List<String> planets) {
        for (int i = 0; i < planets.size(); i++) {
            int temp = Collections.frequency(planets, planets.get(i));
            if (temp > 1) {
                planets.remove(i);
            }
        }
        System.out.println(planets);
    }
}