package branching;

import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x ");
        int x = sc.nextInt();
        double result;
        if (x < 8) {
            result = 1 / (Math.pow(x, 4) - 6);
        } else {
            result = -Math.pow(x, 2) + x - 9;
        }
        System.out.println("Result = " + result);
    }
}
