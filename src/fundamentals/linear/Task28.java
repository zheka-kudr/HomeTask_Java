package fundamentals.linear;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        double angle = getNum("radians");
        double deg = Math.toDegrees(angle);
        double M = deg * 60;
        double S = M * 60;

        System.out.println("Degrees = " + deg);
        System.out.println("Minutes = " + M);
        System.out.println("Seconds = " + S);
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}
