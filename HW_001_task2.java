public class HW_001_task2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (checkForNatural(i)) {
                System.out.println(i);
            }
        }
    }
    private static boolean checkForNatural(int number){
        boolean isNaturalNumber = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isNaturalNumber = false; 
                break;
            }
        }
        return isNaturalNumber;
    }
}