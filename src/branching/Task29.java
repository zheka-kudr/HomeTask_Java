package branching;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        int x1 = getNum("x1");
        int y1 = getNum("y1");
        int x2 = getNum("x2");
        int y2 = getNum("y2");
        int x3 = getNum("x3");
        int y3 = getNum("y3");
        if ((double) ((x3 - x1) / (x2 - x1)) == (double) ((y3 - y1) / (y2 - y1))) {
            System.out.println("Three points are on one straight");
        }
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}
