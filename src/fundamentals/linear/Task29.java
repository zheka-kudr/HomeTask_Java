package fundamentals.linear;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        double a = getNum("a");
        double b = getNum("b");
        double c = getNum("c");

        double angleBetweenAB = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
        System.out.println("Angle between a and b in radians= " + angleBetweenAB);
        System.out.println("Angle between a and b in radians= " + Math.toDegrees(angleBetweenAB));

        double angleBetweenBC = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * c * b));
        System.out.println("Angle between b and c in radians= " + angleBetweenBC);
        System.out.println("Angle between b and c in radians= " + Math.toDegrees(angleBetweenBC));

        double angleBetweenAC = Math.PI - angleBetweenAB - angleBetweenBC;
        System.out.println("Angle between a and c in radians= " + angleBetweenAC);
        System.out.println("Angle between a and c in radians= " + Math.toDegrees(angleBetweenAC));
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}
