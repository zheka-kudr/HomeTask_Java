package fundamentals.decomposition;

import java.awt.geom.Point2D;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        double x1 = getNum("x1");
        double y1 = getNum("y1");
        double x2 = getNum("x2");
        double y2 = getNum("y2");
        double x3 = getNum("x3");
        double y3 = getNum("y3");
        System.out.println("Area = " + countSquare(x1, y1, x2, y2, x3, y3));
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }

    private static Double countSquare(double x1, double y1, double x2, double y2, double x3, double y3) {
        double x = Point2D.distance(x1, y1, x2, y2);
        double y = Point2D.distance(x1, y1, x3, y3);
        double z = Point2D.distance(x3, y3, x2, y2);
        double perimeter = x + y + z;
        double square = Math.sqrt((perimeter / 2) * (perimeter / 2 - x) * (perimeter / 2 - y) * (perimeter / 2 - z));
        return square;
    }
}
