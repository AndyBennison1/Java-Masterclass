public class Maskify {
    String answer;

    public static String maskify(String str) {
//        throw new UnsupportedOperationException("Unimplemented");
        int length = str.length();
        char[] chars = str.toCharArray();

        for (int i = 0; i < (chars.length -4) ; i++)  {
            chars[i] = '#';
        }
    //    String finalWord = String.valueOf(chars);
        //   return finalWord;

return new String(chars);

    }

    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
        System.out.println(maskify("64607935616"));
    }

}
