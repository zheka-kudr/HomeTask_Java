package fundamentals.linear;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        double a = getNum("a");
        double h = (a * Math.sqrt(3)) / 2;
        double S = a * h / 2;
        double r = (Math.sqrt(3) / 6) * a;
        double R = 2 * r;
        System.out.println("h = " + h);
        System.out.println("S = " + S);
        System.out.println("r = " + r);
        System.out.println("R = " + R);
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}