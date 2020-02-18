public class Sum {
    public static int GetSum(int a, int b) {
        //Good luck!
        if (a == b) {
            return a;
        } else if (a > b) {
            return (((a-b)+1) * (b + a) / 2);
        } else {
            return (((b-a)+1) * (a + b) / 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(GetSum(1, 0));
        System.out.println(GetSum(1, 2));
        System.out.println(GetSum(0, 1));
        System.out.println(GetSum(-26, 195));
        System.out.println(GetSum(155, 3 ));

    }

}

