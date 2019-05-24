package fundamentals.branching;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        int a = getNum("a");
        int b = getNum("b");
        int c = getNum("c");
        int d = getNum("d");
        int min1 = a;
        int min2 = c;
        if (min1 > b) {
            min1 = b;
        }
        if (min2 > d) {
            min2 = d;
        }
        if (min1 > min2) {
            System.out.println("The biggest num = " + min1);
        } else {
            System.out.println("The biggest num = " + min2);
        }

    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}
