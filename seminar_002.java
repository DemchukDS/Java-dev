public class seminar_002 {
    public static void main(String[] args) {
        
        // Дано четное число N (>0) и символы c1 и c2.
        // Написать метод, который вернет строку длины N, которая
        // состоит из чередующихся символов c1 и c2, начиная с c1.

        // System.out.print("Введите четное число N, которое больше нуля: ");
        // int numberN = ScannerUtil.enterInteger();
        // System.out.print("Введите первый символ: ");
        // char c1 = ScannerUtil.enterChar();
        // System.out.print("Введите второй символ: ");
        // char c2 = ScannerUtil.enterChar();
        // checkCorrectEnteredNumber(numberN, c1, c2);
        // fillStringWithChar(numberN, c1, c2);
        // ScannerUtil.closeScanner();



        // Напишите метод, который сжимает строку.
        // Пример: вход aaaabbbcdd, выход: abcd

        // System.out.println("Введите строку элементов, которую необходимо скорректировать (удалить вподряд идущие дубли): ");
        // String myInputString = ScannerUtil.enteString();
        // StringBuilder result = new StringBuilder();
        // char[] array = myInputString.toCharArray();
        // for (int i = 0; i < array.length; i++) {
        //     if (i == 0 || array[i] != array[i - 1]) {
        //         result.append(array[i]);
        //     }
        // }
        // System.out.println(result);


        
        // Напишите метод, который принимает на вход строку (String) и определяет является
        // ли строка палиндромом (возвращает boolean значение).
        
        System.out.println(reverseString("Шалаш"));
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
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < number + 1; i++) {
            if (i % 2 == 1) {
                result.append(sumbolOne).append(sumbolTwo);
                i++;
            }
        }
        System.out.print(result);
    }

    public static boolean reverseString(String myString) {
        String sourse = myString.replaceAll(" ", ""); // Убирает пробелы
        StringBuilder result = new StringBuilder(sourse);
        String reversed = result.reverse().toString(); // меняет символы местами первый и последний и т.д.
        return sourse.equalsIgnoreCase(reversed);
    }
}