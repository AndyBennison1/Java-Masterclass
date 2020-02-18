public class BeadsCounter {

    public static int countRedBeads(final int nBlue) {
        int result;
        if (nBlue < 2) {
            result = 0;
        } else
        result = ((nBlue - 1) * 2);
        return result;
    }
    public static void main(String[] args) {



    }
}

