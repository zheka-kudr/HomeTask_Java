package fundamentals.linear;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        double a = getNum("a");
        double b = getNum("b");
        double c = getNum("c");
        double D = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            double x1 = (-b - D) / 2 * a;
            double x2 = (-b + D) / 2 * a;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}
