import java.util.Scanner;

public class scanner_class_string {
    
    public static String scanner_class_string() {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        input.close();
        return line;
    }
}
