package fundamentals.linear;

import java.awt.geom.Point2D;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        double x1 = getNum("x1");
        double y1 = getNum("y1");
        double x2 = getNum("x2");
        double y2 = getNum("y2");
        double result = Point2D.distance(x1, y1, x2, y2);
        System.out.println("Result = " + result);
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}