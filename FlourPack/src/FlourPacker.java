public class FlourPacker {

    // write your code here
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean answer;
        int large = 5;
        double target;
        target = goal / 5;
        if ((bigCount < 0) || (smallCount < 0)) {
            answer = false;
        } else {
            if (bigCount * large > goal) {
                answer = false;
            } else {
                if ((bigCount * large) + (smallCount) >= goal) {
                    answer = true;
                } else {
                    answer = false;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
    }
}

