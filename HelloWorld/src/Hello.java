import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        System.out.println("Hi Andy!");
        int myFirstNumber = 35;
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int diff = 1000 - myTotal;

        System.out.println(diff);


        short myShort = 26;
        byte myByte = 95;
        long myLong = 50000L + 10L * (myByte + myShort + mySecondNumber);

        System.out.println(myLong);

        short myShortTwo = (short) (myShort / 2);






    }
}
