package com.bridgelabz;
                    //Vowel or Consonent
/*
Java Program to Check Whether an Alphabet is Vowel or Consonant
 */

import java.util.Scanner;

public class VowelOrConsonent {
    static char ch;
    public static void main(String[] args) {
        System.out.println("Check the alphabet is vowel or consonent");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            System.out.println("Enter aplphabet is Vowel");
        }
        else {
            System.out.println("Enter aplphabet is Consonent");
        }
    }
}
