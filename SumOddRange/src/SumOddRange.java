public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false; }
        else if (number % 2 == 1) {
            return true;
        }
        else
            {return false; }
    }

    public static int sumOdd(int start, int end) {
        System.out.println(start);
        System.out.println(end);
        int counter = 0;


        for (int i = start; i <= end; i++ ) {
            System.out.println(i);
            if (isOdd(i)) {
                counter = counter + i;
            }
        }
        if (start <= 0) {counter = -1;}
        if (end < start) {counter = -1;}
        return counter;
    }

    public static void main(String[] args) {
        System.out.println("your total is " + sumOdd(100,1000));
    }

}
