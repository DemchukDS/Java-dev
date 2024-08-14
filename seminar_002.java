public class seminar_002 {
    public static void main(String[] args) {
        
        // Дано четное число N (>0) и символы c1 и c2.
        // Написать метод, который вернет строку длины N, которая
        // состоит из чередующихся символов c1 и c2, начиная с c1.

        System.out.print("Введите четное число N, которое больше нуля: ");
        int numberN = ScannerUtil.enterInteger();
        if (numberN <= 0) {
            System.out.println("Введенное число меньше либо равно 0, что не соответствует условию!");
        }
        else if (numberN % 2 != 0) {
            System.out.println("Введенное число не является четным, что не соответствует условию!");
        } else {
            System.out.print("Введите первый символ: ");
            char c1 = ScannerUtil.enterChar();
            System.out.print("Введите второй символ: ");
            char c2 = ScannerUtil.enterChar();
            for (int i = 0; i < numberN; i++) {
                if (i % 2 == 0) {
                    System.out.print(c1);
                } else {
                    System.out.print(c2);
                }
            }
        }
    }
}
