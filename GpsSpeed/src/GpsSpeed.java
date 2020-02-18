public class GpsSpeed {

        public static int gps(int s, double[] x) {
            // your code
int averageSpeed = 0;
double speed = 0;
    for (int i = 0; i< x.length; i++)
        if (x[i] == x[i-1]) {
            speed += 0;
        }
    else if (x[i] > x[i-1])
        {
            speed += (x[i] - x[i-1]) / s;
        }


    averageSpeed = (int)(Math.floor(speed * x.length));
            return averageSpeed;
}

    public static void main(String[] args) {
        double[] x = new double[] {0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61};
        System.out.println(GpsSpeed.gps(20, x));
    }
    }
