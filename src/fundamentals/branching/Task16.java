package fundamentals.branching;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int x = getNum("X");
        int y = getNum("Y");
        if (x == 0 && y == 0) {
            System.out.println("This is the origin");
        } else if (x != 0 && y == 0) {
            System.out.println("The point lies on the axis OX");
        } else if (x == 0 && y != 0) {
            System.out.println("The point lies on the axis OY");
        } else if (x > 0 && y > 0) {
            System.out.println("Point in 1 quarter");
        } else if (x < 0 && y > 0) {
            System.out.println("Point in 2 quarter");
        } else if (x < 0 && y < 0) {
            System.out.println("Point in 3 quarter");
        } else {
            System.out.println("Point in 4 quarter");
        }
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}