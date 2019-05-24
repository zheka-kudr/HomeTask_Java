package fundamentals.arrays2D;

import java.util.Random;

public class Task08 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                Random random = new Random();
                a[i][j] = random.nextInt(20);
                System.out.printf("%3d", a[i][j]);
                if (a[i][j] == 7) {
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("7 met = " + count);
    }
}
