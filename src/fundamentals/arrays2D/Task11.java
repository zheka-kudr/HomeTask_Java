package fundamentals.arrays2D;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows m ");
        int m = sc.nextInt();
        System.out.print("Enter num of columns n ");
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                Random random = new Random();
                a[i][j] = random.nextInt(10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                for (int j = a[i].length - 1; j >= 0; j--) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}