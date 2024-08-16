import java.util.Scanner;
public class ScannerUtil {
    private static Scanner inputValue;
    private static Scanner getInputValue() {
        if (inputValue == null) {
            inputValue = new Scanner(System.in);
        }
        return inputValue;
    }

    public static String enterString() {
        Scanner input = getInputValue();
        String line = input.nextLine();
        return line;
    }

    public static int enterInteger() {
        Scanner input = getInputValue();
        int number = input.nextInt();
        return number;
    }

    public static char enterChar() {
        Scanner input = getInputValue();
        char symbol = input.next().charAt(0);
        return symbol;
    }

    public static void closeScanner() {
        Scanner input = getInputValue();
        input.close();
    }
}
