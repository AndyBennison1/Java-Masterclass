public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int megaByte = (kiloBytes / 1024);
        int remainder = (kiloBytes % 1024);

        if (kiloBytes < 0)
            System.out.println("Invalid Value");
        else {
            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + remainder + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1023);
    }

}