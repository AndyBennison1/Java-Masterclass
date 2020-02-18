public class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code

        percent = percent / 100;
        double total = p0;
        int n = 0;
        //n = totalYears
        total = p0;
        System.out.println(total);
        for (int i = 1; total < p; i++) {
            System.out.println(total);
            total = (total + (total * percent) + aug);
            System.out.println(total);
            n = i;
            System.out.println(n);


        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(nbYear(1500, 5, 100, 5000));
        // System.out.println(nbYear(1500000, 2.5, 10000, 2000000));
        // System.out.println(nbYear(1500000, 0.25, 1000, 2000000));
    }

}
