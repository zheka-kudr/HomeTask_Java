package fundamentals.arrays2D;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows and columns ");
        int m = sc.nextInt();
        int[][] a = new int[m][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    a[i][j] = (i + 1) * (i + 2);
                    System.out.printf("%3d", a[i][j]);

                } else {
                    System.out.printf("%3d", a[i][j]);
                }
            }
            System.out.println();
        }
    }
}