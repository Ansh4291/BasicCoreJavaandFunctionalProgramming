package com.bridgelabz;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        int Divisor, Dividend;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Divisor:");
        Divisor = sc.nextInt();
        System.out.println("Enter Dividend:");
        Dividend = sc.nextInt();

        int Quotient = Divisor / Dividend;
        int Remainder = Divisor % Dividend;

        System.out.println("Quotient = " + Quotient);
        System.out.println("Remainder = " + Remainder);
    }
}
