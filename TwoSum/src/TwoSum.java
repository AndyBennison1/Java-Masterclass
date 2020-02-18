public class TwoSum {
    public static int[] twoSum(int[] numbers, int target)
    {
        int index1;
        int index2;

        for (int x=0; x < numbers.length; x++ ) {
            for (int y  = 0; y < numbers.length; y++) {
                if (numbers[x] + numbers[y] == target)
                    return new int[]{x,y};
                            }
        }



        return null; // Do your magic!
    }

}
