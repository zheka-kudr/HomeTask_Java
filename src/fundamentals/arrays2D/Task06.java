package fundamentals.arrays2D;

import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        int[][] a = new int[10][8];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                Random random = new Random();
                a[i][j] = random.nextInt(10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i < a.length; i += 2) {
            if (a[i][0] > a[i][a[0].length - 1]) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
