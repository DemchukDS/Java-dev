import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class lecture_001 {
    public static void main(String[] args) { // pub
        
        // System.out.println("Hello Java's world!");


        // String a;
        // a = "Dima";
        // System.out.println(a);


        // double pi = 3.14;
        // float number = 3.14f;
        // System.out.println(pi);
        // System.out.println(number);

        
        // char sumbol = '{'; // Если указать вместо скобки 123 - выдаст тоже скобку. Он переобразует неявно значение 123 в символ.
        // System.out.println(sumbol);


        // String s = "qwerty";
        // s.length();
        // s.charAt(3);
        // System.out.println(s);
        // System.out.println(s.length());
        // System.out.println(s.charAt(3));


        // boolean bol = 123 <= 234;
        // System.out.println(bol);


        // int[] arr= new int[10];
        // arr[5] = 21;
        // System.out.println(arr.length);
        // System.out.println(arr[5]);
        // arr = new int[] {1, 2, 3, 4, 5};
        // System.out.println(arr.length);
        // System.out.println(arr[3]);


        // int[] arr[] = new int [3][5];
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.printf("+", arr[i][j]);
        //     }
        //     System.out.println();
        // }


        // // import java.util.Scanner вначале
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("Enter your name: ");
        // String name = iScanner.nextLine(); // Если инт - инициализуем инт и пишем next.Int, точно так же с другими форматами.
        // System.out.printf("Hello, %s!", name);
        // iScanner.close();


        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("Enter the number: ");
        // boolean flag = iScanner.hasNextInt(); // Проверка на инт и далее условие при положительной проверке.
        // if (flag == true) {
        //     int number = iScanner.nextInt();
        //     System.out.printf("Your entered number is %s!", number);
        // }
        // else {
        //     System.out.println("You enterred incorrect data!");
        // }
        // iScanner.close();
        

        // Задачи для самоконтроля
        //  1. Задана натуральная степень k. Сформировать случайным
        // образом список коэффициентов (значения от 0 до 100)
        // многочлена степени k.
        // *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
        //  2. Даны два файла, в каждом из которых находится запись
        // многочлена. Сформировать файл содержащий сумму
        // многочленов.

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("Enter variable *k*: ");
        // boolean flag = iScanner.hasNextInt();
        // if (flag == true) {
        //     int number = iScanner.nextInt();
        //     int[] array = new int[101];
        //     for (int i = 0; i < array.length; i++) {
        //         Random random = new Random();
        //         int randomNumber = random.nextInt(101);
        //         array[i] = randomNumber;
        //     }
        //     for (int j = 0; j < number + 1; j++) {
        //         //System.out.println(array[j]);
        //         System.out.println((int) Math.pow(array[j], number));
        //     }
        // } else {
        //     System.out.println("You entered incorrect value!");
        // }

    }
}
