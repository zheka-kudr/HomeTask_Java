package fundamentals.linear;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        double a = getNum("a");
        double b = getNum("b");
        double angle = getNum("angle");
        double S = ((a * b) * Math.sin(Math.toRadians(angle))) / 2;
        System.out.println("S = " + S);
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}
