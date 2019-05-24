package fundamentals.arrays2D;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        for (int i = 0; i < a.length; i++) {
            Random random = new Random();
            a[i][random.nextInt(4)] = 1;
        }
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
