package fundamentals.branching;

import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x ");
        int x = sc.nextInt();
        double result;
        if (x > 13) {
            result = -3 / (x + 1);
        } else {
            result = -Math.pow(x, 2) + 9;
        }
        System.out.println("Result = " + result);
    }
}
