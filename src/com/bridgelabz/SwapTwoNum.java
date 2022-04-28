package com.bridgelabz;
            //Swap of two numbers
/*
Java Program to Swap Two Numbers
 */

public class SwapTwoNum {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        System.out.println("before swap");
        System.out.println("a is :-" + a);
        System.out.println("b is :-" + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swap of two numbers are ");
        System.out.println("a is :-" + a);
        System.out.println("b is :-" + b);

    }
}
