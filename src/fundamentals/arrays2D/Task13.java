package fundamentals.arrays2D;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows and columns ");
        int m = sc.nextInt();
        if (m % 2 == 0) {
            int[][] a = new int[m][m];
            for (int i = 0; i < a.length; i++) {
                if (i % 2 != 0) {
                    for (int j = a[i].length - 1; j >= 0; j--) {
                        a[i][j] = j + 1;
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                } else {
                    for (int j = 0; j < a[i].length; j++) {
                        a[i][j] = j + 1;
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}