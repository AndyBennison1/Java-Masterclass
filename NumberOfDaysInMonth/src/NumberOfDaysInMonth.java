public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2100));


        System.out.println(getDaysInMonth(5,1997));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));
        System.out.println(getDaysInMonth(8,2100));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 9999 || year <= 1) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else return false;
    }

    public static int getDaysInMonth(int month, int year) {
        int days = -1;
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return days;
        } else if (isLeapYear(year)) {
            switch (month) {
                case 2:
                    days = 29;
                    break;
                case 4: case 6: case 9: case 11:
                    days =  30;
                break;
                default:
                    days = 31;
                    break;
            }
        } else if (isLeapYear(year) == false)
        {
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                break;
                case 2:
                    days = 28;
                break;
                default:
                    days = 31;
                break;
            }
        }

        else {
            return -1;
        }
return days;
    }
}