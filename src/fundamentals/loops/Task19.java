package fundamentals.loops;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter e ");
        double e = sc.nextDouble();
        int n = 0;
        double an = 2;
        double sum = an;
        while (e <= Math.abs(an)) {
            n++;
            an = (1 / (Math.pow(2, n))) + (1 / (Math.pow(3, n)));
            sum += an;
        }
        System.out.println("Sum = " + sum);
    }
}