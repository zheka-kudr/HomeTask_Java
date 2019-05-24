package fundamentals.arrays2D;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows and columns ");
        int m = sc.nextInt();
        int[][] a = new int[m][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0) {
                    a[i][j] = 1;
                    System.out.printf("%3d", a[i][j]);
                } else if (i == m - 1) {
                    a[i][j] = 1;
                    System.out.printf("%3d", a[i][j]);
                } else if (j == 0) {
                    a[i][j] = 1;
                    System.out.printf("%3d", a[i][j]);
                } else if (j == m - 1) {
                    a[i][j] = 1;
                    System.out.printf("%3d", a[i][j]);
                } else {
                    a[i][j] = 0;
                    System.out.printf("%3d", a[i][j]);
                }
            }
            System.out.println();
        }
    }
}