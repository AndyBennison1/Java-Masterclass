public class Kata {
//        System.out.println(stringArray[0]);
//        System.out.println(stringArray[1]);
//        System.out.println(stringArray[2]);
//        System.out.println(stringArray[3]);
//        System.out.println(stringArray[4]);
//        System.out.println(stringArray[5]);
//        System.out.println(stringArray[6]);
//        System.out.println(stringArray[7]);
//        System.out.println(stringArray[8]);

    public static int findShort(String s) {

    //split the string into an array - delimited by spaces
    String[] stringArray = s.split("\\s");

    //create a control array to store the shortest string
    String[] Answers = new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"};

    //variable to hold the length of the shortest string
    int answer = 0;

    //loop through each string in the array
    for (int i = 0; i < stringArray.length; i++)
    {

        // if the string in the array is shorter than the first string in the control array then replaces it
        if (stringArray[i].length() < Answers[0].length()) {
            Answers[0] = stringArray[i];
            //declare the answer and overwrite it if the shortest one changes
            answer = Answers[0].length();
        }


    }
    //return the shortest strings length
    return answer;
    }

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
    }

}

/*
alternative solution

import java.util.stream.*;
public class Kata {
    public static int findShort(String s) {
        return Stream.of(s.split(" "))
          .mapToInt(String::length)
          .min()
          .getAsInt();
    }
}

*/
