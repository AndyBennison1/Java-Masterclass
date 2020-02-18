import java.util.Arrays;
public class Solution {
/*    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        // your code goes here
    int result;

    // step one
        result = (age1 * age1) + (age2 * age2) + (age3 * age3) + (age4 * age4) + (age5 * age5) + (age6 * age6) + (age7 * age7) + (age8 * age8);
        result = (int)(Math.sqrt(result));
        result = result / 2;


        return result;
    }*/

    public static int predictAge(int ... ages) {
        // your code goes here
        int result;
        int sqrt  = (int) Math.sqrt(Arrays.stream(ages)
                .map(a -> a*a)
                .sum()
        );
                result = sqrt /2;
        return  result;
    }

}
