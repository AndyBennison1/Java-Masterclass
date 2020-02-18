import java.util.Arrays;

public class FindOdd {
    public static int findIt(int[] a) {
        int counter = 0;
        int[] indexes = new int[100];
        int odd = 0;

        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            a[i] = indexes[i];

            if (indexes.length % 2 != 0) {
                odd = a[i];
            }
        }
        return odd;
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
    }
}