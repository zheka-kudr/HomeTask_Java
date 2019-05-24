package fundamentals.loops;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        double a = getNum("a");
        double b = getNum("b");
        double h = getNum("h");
        for (; a <= b; a += h) {
            double f = (1 / Math.tan(a / 3)) + (Math.sin(a) / 2);
            System.out.println("a = " + a + "\tF(a) = " + f);
        }
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}
