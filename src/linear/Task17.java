package linear;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        double a = getNum("first num");
        double b = getNum("second num");
        double arithm = (a + b) / 2;
        double geom = Math.sqrt(a * b);
        System.out.println("Arithmetic = " + arithm);
        System.out.println("Geometric = " + geom);
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}