import java.util.ArrayList;
import java.util.List;

public class seminar_003 {
    public static void main(String[] args) {
        // Даны следующие строки, cравнить их с помощью == и метода equals() класса Object

        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        List<String> temp = new ArrayList<>();
        temp.add(s1);
        temp.add(s2);
        temp.add(s3);
        temp.add(s4);
        temp.add(s5);
        temp.add(s6);

        for (int i = 0; i < temp.size(); i++) {
            for (int j = 0; j < temp.size(); j++) {
                boolean flag = temp.get(i) == temp.get(j);

                System.out.println((i + 1) + " " + (j + 1) + " == " + flag);
                System.out.println((i + 1) + " " + (j + 1) + " equals " + temp.get(i).equals(temp.get(j)));
                System.out.println("-------------------");
            }
        }
    }
}