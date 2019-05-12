package branching;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        int a = getNum("a");
        int b = getNum("b");
        int c = getNum("c");
        if (a > b && b > c) {
            a = a * 2;
            b = b * 2;
            c = c * 2;
            System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
            System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        }

    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}
