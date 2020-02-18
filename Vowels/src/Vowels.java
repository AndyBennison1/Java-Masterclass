public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        String letter;
        char[] chars = str.toCharArray();
        char[] charsVowels = new char[] {'a', 'e', 'i', 'o', 'u'};
        int counter2 = 0;
        int counter = 0;
//
//        String mystring = "aeiou";
//        char[] mychars = mystring.toCharArray();

        // your code here

        for (int n = 0; n < chars.length; n++) {
            for (int m = 0; m < charsVowels.length; m++)
                {
                    if (chars[n] == charsVowels[m]) {
                        System.out.println(charsVowels[m]);
                        vowelsCount += 1;
                    }
                }
        }
//        else if (chars[n] == 'e')  {
//
//        }
//             || chars[n] == 'e' || 'i' || 'o' || 'u')) {
//        }

        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(getCount("theoratical"));
    }
}