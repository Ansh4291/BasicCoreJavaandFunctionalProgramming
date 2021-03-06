package com.bridgelabz;
            //Leap year
/*
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or not.
 */
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println("Year is a leap year");
        }
        else {
            System.out.println("year is not a leap year");
        }
    }
}
