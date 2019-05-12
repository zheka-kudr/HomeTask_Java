package branching;

import java.awt.geom.Point2D;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int x1 = getNum("x1");
        int y1 = getNum("y1");
        int x2 = getNum("x2");
        int y2 = getNum("y2");
        double x = Point2D.distance(x1, y1, 0, 0);
        double y = Point2D.distance(x2, y2, 0, 0);
        if (x < y) {
            System.out.println("(" + x1 + "," + y1 + ") is closer to (0,0)");
        } else if (x > y) {
            System.out.println("(" + x2 + "," + y2 + ") is closer to (0,0)");
        } else {
            System.out.println("(" + x1 + "," + y1 + ")=(" + x2 + "," + y2 + ")");
        }
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}