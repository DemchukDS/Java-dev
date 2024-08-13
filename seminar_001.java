import java.util.Calendar;
import java.util.Scanner;
import java.util.Random;

public class seminar_001 {
    public static void main(String[] args) {
        // Написать программу, которая запросит пользователя ввести
        // <Имя> в консоли.
        // Получит введенную строку и выведет в консоль сообщение
        // “Привет, <Имя>!”
        
        // System.out.println("Enter your name:  ");
        // String name = scanner_class_string.scanner_class_string();
        
        //System.out.printf("Hello, %s!", name);



        // В консоли запросить имя пользователя. В зависимости от
        // текущего времени, вывести приветствие вида
        // "Доброе утро, <Имя>!", если время от 05:00 до 11:59
        // "Добрый день, <Имя>!", если время от 12:00 до 17:59;
        // "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        // "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

        //getGreetingsByTimesOfDay(name);



        // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
        // максимальное количество подряд идущих 1.

        System.out.print("Enter the numbers elements of array: ");
        int[] array = new int[getIntNumber()];
        System.out.println("Array generated: ");
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(2);
            array[i] = randomNumber;
            System.out.printf("%d ", array[i]);
        }
        int value = 0, maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                value++;
            } else {
                if (maxValue < value) {
                    maxValue = value;
                }
                value = 0;
            }
        }
        System.out.println();
        System.out.printf("The number of consecutive units is %d!", maxValue);
    }
    private static void getGreetingsByTimesOfDay(String name) {
        Calendar calendar = Calendar.getInstance();
        int currentHour = calendar.get(Calendar.HOUR_OF_DAY);
        if (currentHour >= 5 && currentHour < 12){
            System.out.printf("Good morning, %s!", name);
        }
        else if (currentHour >= 12 && currentHour < 18) {
            System.out.printf("Good day, %s!", name);
        }
        else if (currentHour >= 18 && currentHour < 23) {
            System.out.printf("Good evening, %s!", name);
        } else {
            System.out.printf("Good night, %s!", name);
        }
    }

    private static int getIntNumber(){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        return number;
    }
}