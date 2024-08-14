public class seminar_002 {
    public static void main(String[] args) {
        
        // Дано четное число N (>0) и символы c1 и c2.
        // Написать метод, который вернет строку длины N, которая
        // состоит из чередующихся символов c1 и c2, начиная с c1.

        System.out.print("Введите четное число N, которое больше нуля: ");
        int numberN = ScannerUtil.enterInteger();
        System.out.print("Введите первый символ: ");
        char c1 = ScannerUtil.enterChar();
        System.out.print("Введите второй символ: ");
        char c2 = ScannerUtil.enterChar();
        checkCorrectEnteredNumber(numberN, c1, c2);
        fillStringWithChar(numberN, c1, c2);
    }
    private static void checkCorrectEnteredNumber(int number, char sumbolOne, char sumbolTwo){
        if (number <= 0) {
            System.out.println("Введенное число меньше либо равно 0, что не соответствует условию!");
        }
        else if (number % 2 != 0) {
            System.out.println("Введенное число не является четным, что не соответствует условию!");
        }
    }

    private static void fillStringWithChar(int number, char sumbolOne, char sumbolTwo){
        for (int i = 1; i < number + 1; i++) {
            if (i % 2 == 1) {
                System.out.print(sumbolOne);
            } else {
                System.out.print(sumbolTwo);
            }
        }
    }
}
