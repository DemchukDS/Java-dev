import java.util.Calendar;
import java.util.Date;

public class seminar_001 {
    public static void main(String[] args) {
        // Написать программу, которая запросит пользователя ввести
        // <Имя> в консоли.
        // Получит введенную строку и выведет в консоль сообщение
        // “Привет, <Имя>!”
        
        System.out.println("Enter your name:  ");
        String name = scanner_class_string.scanner_class_string();
        
        //System.out.printf("Hello, %s!", name);



        // В консоли запросить имя пользователя. В зависимости от
        // текущего времени, вывести приветствие вида
        // "Доброе утро, <Имя>!", если время от 05:00 до 11:59
        // "Добрый день, <Имя>!", если время от 12:00 до 17:59;
        // "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        // "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

        //getGreetingsByTimesOfDay(name);

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
}
