import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        int currentPassengers = 0;
        int passengersCalculation = 0;

        for (int i = 0; i <stops.size(); i++) {

           for (int j = 0; j < stops.get(i).length; j++)

               passengersCalculation = ( (stops.get(i)[0]) - (stops.get(i)[1] )) ;
          currentPassengers = currentPassengers + passengersCalculation;
             }
        return  currentPassengers ;
        }

    public static void main(String[] args) {

            ArrayList<int[]> list = new ArrayList<int[]>();
            list.add(new int[] {10,0});
            list.add(new int[] {3,5});
            list.add(new int[] {2,5});
        System.out.println(countPassengers(list));
    }

}

