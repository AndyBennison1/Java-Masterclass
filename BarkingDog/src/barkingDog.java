public class BarkingDog {

    public static boolean bark(boolean barking, int hourOfDay ) {
        if (barking) {
            if((hourOfDay >= 0 && hourOfDay <8) || (hourOfDay >22 && hourOfDay <24)){
                return true;
            } else {
                return false;
            }
        }

        else
            return false;
    }

    public static void main(String[] args) {
        bark(true, 21);
    }

}
