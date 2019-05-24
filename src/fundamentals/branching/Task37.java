package fundamentals.branching;

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x ");
        int x = sc.nextInt();
        double result;
        if (x < 3) {
            result = 1 / (Math.pow(x, 3) - 6);
        } else {
            result = -Math.pow(x, 2) + 3 * x + 9;
        }
        System.out.println("Result = " + result);
    }
}
