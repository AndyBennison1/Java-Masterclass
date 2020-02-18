package com.AndyBennison;

public class Main {

    public static void main(String[] args) {

        double myDouble = 20;
        double mySecondDouble = 80;
        double result = (myDouble + mySecondDouble) * 25;
        double remainderResult = result % 40;
        System.out.println(remainderResult);
        if (remainderResult <= 20) {
            System.out.println("Total was over the limit");
        }


    }
}
