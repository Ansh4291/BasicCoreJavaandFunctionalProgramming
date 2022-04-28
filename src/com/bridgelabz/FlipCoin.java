package com.bridgelabz;
            //Flip Coin
/*
a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
heads
c. O/P -> Percentage of Head vs Tails
 */
import javax.swing.text.Utilities;
import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {
        int coinFlip;
        int heads = 0;
        int tails = 0;
        Scanner sc = new Scanner(System.in);
        coinFlip = sc.nextInt();

        for(int i = 0; i < coinFlip; i++){

            if(Math.random() < 0.5) {
                tails++;
            }
            else {
                heads++;
            }

        }
        System.out.println("Count of Head filps :- "+heads+"\nCount of Tails flips :- "+tails);
        double cnttails=tails / (double) coinFlip* 100 ;
        double cnthead= heads/ (double) coinFlip* 100 ;
        System.out.println("Percentage of Head =>"+cnthead+"\nPercentage of  Tails=>"+cnttails);
    }
}
