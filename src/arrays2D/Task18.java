package arrays2D;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows and columns ");
        int m = sc.nextInt();
        int[][] a = new int[m][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = m - 1; j > 0; j--) {
                a[i][j] = 0;
            }
            for (int j = m - i - 1; j >= 0; j--) {
                a[i][j] = i + 1;
            }
        }
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.printf("%2d", anInt);
            }
            System.out.println();
        }
    }
}