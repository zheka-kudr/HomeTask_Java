package fundamentals.loops;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter e ");
        double e = sc.nextDouble();
        double an = -0.5;
        double sum = an;
        for (int n = 1; e <= Math.abs(an); n++) {
            an = (double) 1 / (((3 * n) - 2) * ((3 * n) + 1));
            sum += an;
            System.out.println(an);
        }
        System.out.println("Sum = " + sum);
    }
}
