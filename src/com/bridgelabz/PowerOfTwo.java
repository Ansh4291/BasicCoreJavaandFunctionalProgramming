package com.bridgelabz;
                    // Power of 2
/*
a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
d. O/P -> Print the year is a Leap Year or not.
 */
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int base;
        int exponent;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number:- ");
        base = sc.nextInt();
        System.out.println("enter the exponent :- ");
        exponent = sc.nextInt();


        double power = Math.pow(base , exponent);
        System.out.println(base + " to the power of " + exponent + " is " + power);
    }
}
