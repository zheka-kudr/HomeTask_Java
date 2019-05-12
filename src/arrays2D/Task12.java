package arrays2D;

import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows and columns ");
        int m = sc.nextInt();
        int[][] a = new int[m][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                Random random = new Random();
                if (i != j) {
                    a[i][j] = random.nextInt(10);
                    System.out.print(a[i][j] + " ");
                } else {
                    a[i][j] = i;
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
