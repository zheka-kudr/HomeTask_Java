package fundamentals.loops;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        int m = getNum("m");
        int n = getNum("n");
        for (; m <= n; m++) {
            for (int i = 2; i < m; i++) {
                if (m % i == 0) {
                    System.out.println("m=" + m + " can be divided by " + i);
                }
            }
        }
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}
