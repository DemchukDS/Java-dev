import java.util.ArrayList;
import java.util.Comparator;

public class lecture_003 {
    public static void main(String[] args) {
        // System.out.println(objExSum(31.1, 12.16));
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(93); // Добавляет элемент в конец массива
        list.add(12);
        list.add(64);
        list.add(-7);
        list.add(112);
        list.set(3, null); // Меняет элемент массива под индексом ... 
        list.remove(3); // Удаляет элемент массива под индексом ...
        list.subList(2, 4); // Получает набор данных от указанного индекса до указанного.
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static Object objExSum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        }
        else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        }
        else if (a instanceof String && b instanceof String) {
            return (Object) ((String) a + (String) b);
        }
        else if (a instanceof String && b instanceof Double) {
            return (Object) ((String) a + (String) b);
        } else {
            return 0;
        }
    }
}