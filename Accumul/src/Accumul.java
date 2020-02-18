public class Accumul {

    String answer = " ";


    public static String accum(String inputString) {
        // your code
        String inputString2 = inputString.replace("-", " ");
        StringBuffer buffer = new StringBuffer();
        System.out.println(inputString);
        System.out.println(inputString2);
        String[] myStringArray = inputString2.split("\\s");
//        System.out.println(myStringArray[0]);
//        System.out.println(myStringArray[1]);
//        System.out.println(myStringArray[2]);
        System.out.println("this is a test");
        System.out.println(myStringArray.length);


//        String myString = myStringArray.strip();
        for (int i = 0; i < myStringArray.length; i++) {
            //This is running through each list of character sets eg [0] =  Z, [1] = Pp and [2] = Ggg
            System.out.println(myStringArray[i].length());

            for (int j = 0; j <myStringArray[j].length(); j++)
                if (myStringArray[i].length() == 1) {
    //                    System.out.println(myStringArray.length);
                    System.out.println("this is fine");
                }
                else if (myStringArray[i].length() > 1) {
                        if (myStringArray[j] == myStringArray[0]) {
                        System.out.println("this needs to break");
                            System.out.println(myStringArray[j]);
    //                    myStringArray[j] == myStringArray[0];
    //                    System.out.println(myStringArray.length);
                }
                }



              //  String myString = myStringArray[i].stripTrailing();
                // System.out.println(myString);
            }

            return " "; //myStringArray[6];

    }
        public static void main (String[]args){
            System.out.println(accum("Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu"));
        }

}