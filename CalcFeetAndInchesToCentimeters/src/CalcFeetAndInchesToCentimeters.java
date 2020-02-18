public class CalcFeetAndInchesToCentimeters {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeters = 0;
        if (feet <= 0 || (inches <= 0 || inches >= 12 )) {
            centimeters = -1;
        }
        else {
            centimeters = (feet * 12 * 2.54) + (inches * 2.54);

        }

        return centimeters;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
double feet = 0;
double inchesLeft = 0;

if (inches <= 0) {
    return -1;
}
else {
    feet = Math.floor(inches / 12);
    System.out.println(feet);
    inchesLeft = inches % 12;
}

    return calcFeetAndInchesToCentimeters(feet, inchesLeft );
    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(4, 7));
        System.out.println(calcFeetAndInchesToCentimeters(55));
    }
}

