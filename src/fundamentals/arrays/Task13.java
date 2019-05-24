package fundamentals.arrays;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter L ");
        int L = sc.nextInt();
        System.out.print("Enter N ");
        int N = sc.nextInt();
        if (N > L) {
            System.out.print("Enter M ");
            int M = sc.nextInt();
            int count = 0;
            int oldL = L;
            for (; L <= N; L++) {
                if (L % M == 0) {
                    count++;
                }
            }
            System.out.println("Number of numbers in [" + oldL + ";" + N + "]/" + M + " = " + count);
        }
    }
}