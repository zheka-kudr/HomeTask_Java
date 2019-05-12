package arrays2D;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows and columns ");
        int m = sc.nextInt();
        int[][] a = new int[m][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = a[i].length - 1; j >= 0; j--) {
                if (i == j) {
                    a[i][j] = i + 1;
                    System.out.print(a[i][j] + " ");

                } else {
                    System.out.print(a[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}

