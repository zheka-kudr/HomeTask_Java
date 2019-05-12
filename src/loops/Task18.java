package loops;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter e ");
        double e = sc.nextDouble();
        int n = 1;
        double an = 1;
        double sum = an;
        while (e <= Math.abs(an)) {
            n++;
            an = Math.pow(-1, (n - 1)) / n;
            sum += an;
        }
        System.out.println("Sum = " + sum);
    }
}