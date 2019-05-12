package arrays2D;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        for (int i = 0; i < a.length; i++) {
            Random random = new Random();
            a[i][random.nextInt(4)] = 1;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
