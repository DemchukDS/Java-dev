public class HW_001 {
    public static void main(String[] args) {
        // Tn = 1 + 2 + ... + n = ?
        System.out.print("Enter the number N: ");
        int number = scanner_class_int.scanner_class_int();
        int sum = 0;
        if (number < 1) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < number + 1; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
}
