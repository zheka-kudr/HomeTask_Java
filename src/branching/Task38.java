package branching;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x ");
        int x = sc.nextInt();
        int result;
        if (x > 3 || x < 0) {
            result = 4;
        } else {
            result = (int) Math.pow(x, 2);
        }
        System.out.println("Result = " + result);
    }
}
