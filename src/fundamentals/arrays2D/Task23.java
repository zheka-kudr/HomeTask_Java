package fundamentals.arrays2D;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows and columns ");
        int m = sc.nextInt();
        double[][] a = new double[m][m];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / m);
                if (a[i][j] > 0) {
                    count++;
                }
                a[i][j] = Double.parseDouble(new DecimalFormat("##.###").format(a[i][j]));
                System.out.printf("%7.3f", a[i][j]);

            }
            System.out.println();
        }
        System.out.println("Positive elements in array = " + count);
    }
}
