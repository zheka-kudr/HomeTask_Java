package fundamentals.linear;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        double inNSmall = 80;
        int inBigMoreThanInSmall = 12;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of small:");
        int numOfSmall = sc.nextInt();
        double inOneSmall = inNSmall / numOfSmall;
        System.out.println("In one small: " + inOneSmall);
        double inOneBig = inOneSmall + inBigMoreThanInSmall;
        System.out.println("In one big: " + inOneBig);
        System.out.print("Enter num of big: ");
        int numOfBig = sc.nextInt();
        double inMBig = numOfBig * inOneBig;
        System.out.println("In m big: " + inMBig);
    }
}
