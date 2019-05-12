package arrays2D;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows and columns ");
        int m = sc.nextInt();
        int[][] a = new int[m][m];
        for (int j = 0; j < m; j++) {
            a[0][j] = sc.nextInt();
        }

        for (int j = 0; j < a[0].length; j++) {
            System.out.printf("%5d", a[0][j]);
        }
        System.out.println();

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) Math.pow(a[0][j], i + 1);
                System.out.printf("%5d", a[i][j]);
            }
            System.out.println();
        }
    }
}
