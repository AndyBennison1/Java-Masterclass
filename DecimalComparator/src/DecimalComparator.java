public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        double Number1 = ((num1 * 1000));
        double Number2 = ((num2 * 1000));
        if ((int)Number1 == (int)Number2) {
            System.out.println(Number1);
            System.out.println(Number2);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(5.34556d, 3.343455d));
        System.out.println(areEqualByThreeDecimalPlaces(5.34556d, 5.345111d));
        System.out.println(areEqualByThreeDecimalPlaces(5.34556d, 5.344999d));
        System.out.println(areEqualByThreeDecimalPlaces(5.34556d, 5.34556d));
    }
}
