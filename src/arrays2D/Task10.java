package arrays2D;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row k ");
        int k = sc.nextInt();
        System.out.print("Enter column p ");
        int p = sc.nextInt();

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
            System.out.print(a[k - 1][i] + " ");
        }
        System.out.println("\n");
        for (int[] ints : a) {
            System.out.println(ints[p - 1]);
        }

    }
}

