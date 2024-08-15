public class lecture_003 {
    public static void main(String[] args) {
        System.out.println(objExSum(31.1, 12.16));
    }

    private static Object objExSum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        }
        else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        }
        else if (a instanceof String && b instanceof String) {
            return (Object) ((String) a + (String) b);
        }
        else if (a instanceof String && b instanceof Double) {
            return (Object) ((String) a + (String) b);
        } else {
            return 0;
        }
    }
}