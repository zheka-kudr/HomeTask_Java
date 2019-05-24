package fundamentals.linear;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        double a = getNum("length");
        double edge = Math.pow(a, 2);
        double v = Math.pow(a, 3);
        double surface = 6 * edge;
        System.out.println("Edge area = " + edge);
        System.out.println("V = " + v);
        System.out.println("Surface area = " + surface);
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}