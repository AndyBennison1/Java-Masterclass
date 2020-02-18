public class CalculateInterest {
    public static void main(String[] args) {

//        for (int i = 8; i >= 2; i--) {
//            System.out.println(calculateInterest(10000.0, i));
//        }
        int counter = 0;
        for(int i= 1; i <1000; i++) {

            if (isPrime(i)) {
                System.out.println("Your prime number is " + i);
                counter++;
            }
            if (counter == 17) {
                break;
            }
        }


    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


    public static String primeNums(int n) {
        int counter = 0;
        if (isPrime(n)) {
            counter++;
        }
        return "The prime numbers are" + n;

    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
