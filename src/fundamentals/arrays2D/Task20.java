package fundamentals.arrays2D;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows and columns ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            if (i < n / 2) {
                for (int j = i; j < n - i; j++) {
                    a[j][i] = 1;
                }
            } else {
                for (int j = i; j > n - i - 2; j--) {
                    a[j][i] = 1;
                }
            }
        }
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
