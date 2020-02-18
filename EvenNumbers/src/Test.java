import java.util.ArrayList;
import java.util.List;

class Point {
        int x;
        int y;
        void assign(int x, int y) {
            x = this.x;
            this.y = y;
        }

        public String toString() {
            return "Point(" + x + ", " + y + ")";
        }
    }

    public class Test {
        public static void main(String[] args) {
            Point p1 = new Point();
            p1.x = 10;
            p1.y = 20;
            Point p2 = new Point();
            p2.assign(p1.x, p1.y);
            int a = 3;
            System.out.println(p1.toString() + ";" + p2.toString());
            System.out.println(a++ == 3 || --a == 3 && --a == 3);

            List<String> days = new ArrayList<>();
            days.add("SUNDAY");
            days.add("SUNDAY");
            days.add("MONDAY");
            System.out.println(days.size());
            days.clear();
            System.out.println(days.size());

        int i = 10;
            System.out.println(i);

        char myChar = 'g';
        if (myChar == '\u0000')
        System.out.println("is null");
        else {
            System.out.println("is not null");
        }


        }

    }
