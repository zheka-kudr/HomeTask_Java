package fundamentals.linear;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        double a = getNum("a");
        double aPow2 = a * a;
        double aPow4 = aPow2 * aPow2;
        double aPow8 = aPow4 * aPow4;
        double aPow10 = aPow8 * aPow2;
        System.out.println("a^8 = " + aPow8);
        System.out.println("a^10 = " + aPow10);
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}
