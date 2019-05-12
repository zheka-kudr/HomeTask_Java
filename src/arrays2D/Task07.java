package arrays2D;

import java.util.Random;

public class Task07 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                Random random = new Random();
                a[i][j] = -9 + random.nextInt(18);
                System.out.printf("%3d", a[i][j]);
                if (a[i][j] < 0 && Math.abs(a[i][j]) % 2 != 0) {
                    sum += Math.abs(a[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("Sum = " + sum);
    }
}
