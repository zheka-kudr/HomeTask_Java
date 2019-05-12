package branching;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        int x = getNum("x");
        int y = getNum("y");
        if (x < y) {
            int bigger = y;
            y = x;
            x = bigger;
            System.out.println("Now x = " + x + ", and y = " + y);
        }
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}
