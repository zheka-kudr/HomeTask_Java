package fundamentals.loops;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        int a = getNum("a");
        int b = getNum("b");
        while (a > 0) {
            int d = a % 10;
            a = a / 10;
            int c = b;
            while (c > 0) {
                if (c % 10 == d) {
                    System.out.println(d + " ");
                    break;
                }
                c = c / 10;
            }
        }
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}
