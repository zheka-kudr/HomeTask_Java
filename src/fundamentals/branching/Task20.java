package fundamentals.branching;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        int a = getNum("a");
        int b = getNum("b");
        int c = getNum("c");
        int k = getNum("k");
        if (a % k == 0) {
            System.out.println(a + " can be divided by " + k);
        }
        if (b % k == 0) {
            System.out.println(b + " can be divided by " + k);
        }
        if (c % k == 0) {
            System.out.println(c + " can be divided by " + k);
        }
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}
