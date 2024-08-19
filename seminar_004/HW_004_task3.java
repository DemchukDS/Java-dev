package seminar_004;

import java.util.LinkedList;

public class HW_004_task3 {
    public static void main(String[] args) {
        LinkedList<Double> value = new LinkedList<>();
        while (true) {
            System.out.print("Enter the first number: ");
            int firstNmber = ScannerUtil.enterInteger();
            System.out.print("Enter the action: ");
            char symbol = ScannerUtil.enterChar();
            System.out.print("Enter the second number: ");
            int secondNumber = ScannerUtil.enterInteger();
            if (checkForEquality(symbol)) {
                double result = calculate(symbol, firstNmber, secondNumber);
                value.add(result);
            } else {
                value.removeLast();
                System.out.println(value.getLast());
                break;
            }
            System.out.println(value.getLast());
        }
    }

    public static boolean checkForEquality(char symbol) {
        boolean result = false;
        if (symbol != '<') {
            result = true;
        }
        return result;
    }
    public static double calculate(char op, int a, int b) {
        LinkedList<Double> result = new LinkedList<>();
        switch (op) {
            case '+':
                double sum = a + b;
                result.add(sum);
                break;
            case '-':
                double dif = a - b;
                result.add(dif);
                break;
            case '*':
                double work = a * b;
                result.add(work);
                break;
            case '/':
                double priv = a / b;
                result.add(priv);
                break;
        }
        double value = result.getLast();
        return value;
    }
}
