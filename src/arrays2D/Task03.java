package arrays2D;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        int[][] a = new int[5][8];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                Random random = new Random();
                a[i][j] = random.nextInt(10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] ints : a) {
            for (int j = 0; j < ints.length; j += a[0].length - 1) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
