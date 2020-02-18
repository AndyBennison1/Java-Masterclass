public class sumOf3And5 {
    public static void main(String[] args) {
int counter = 0;
int counter2 = 0;
        for(int i = 1; i <=1000; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                counter += i;
                counter2++;
            }
            if (counter2 == 5) {
                System.out.println(counter);
                break;
            }

        }
    }


}
