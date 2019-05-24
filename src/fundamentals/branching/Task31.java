package fundamentals.branching;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        int a = getNum("a");
        int b = getNum("b");
        int x = getNum("x");
        int y = getNum("y");
        int z = getNum("z");
        if ((a < x && b < y) || ((a < x) && (b < z)) || ((a < z) && (b < y))) {
            System.out.println("Brick fit");
        } else {
            System.out.println("Brick doesn't fit");
        }

    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}
