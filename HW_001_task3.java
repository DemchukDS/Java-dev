public class HW_001_task3 {
    public static void main(String[] args) {
        System.out.println("Enter the task: : ");
        float firstNumber = ScannerUtil.enterInteger();
        char sumbol = ScannerUtil.enterChar();
        float secondNumber = ScannerUtil.enterInteger();
        ScannerUtil.closeScanner();
        switch (sumbol) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
        
            default:
                System.out.println("Некорректный оператор: 'оператор'");
                break;
        }
    }
}