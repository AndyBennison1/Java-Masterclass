public class Kata {

    public static int makeNegative(final int x) {


        if (x >0) {
        return x * -1;
    }
    else if (x == 0){
        return x;
    }
    else {
        return x;
        }
    }


    public static void main(String[] args) {
        System.out.println(makeNegative(100));
        System.out.println(makeNegative(-100));
        System.out.println(makeNegative(-190));
        System.out.println(makeNegative(1));
        System.out.println(makeNegative(0));
    }
}
