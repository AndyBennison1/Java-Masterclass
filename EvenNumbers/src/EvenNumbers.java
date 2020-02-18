public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(64));
    }

    public static boolean isEvenNumber(int input) {
        if (input % 2 == 0) {
            return true;
        } else return false;
    }

}
