import java.util.Scanner;

public class scanner_class_int {
    
    public static int scanner_class_int() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        return number;
    }
}