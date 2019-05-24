package fundamentals.branching;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int m = getNum("m");
        int n = getNum("n");
        if (m != n) {
            if (m < n) {
                m = n;
                System.out.println("m = " + m + ", n = " + n);
            } else {
                n = m;
                System.out.println("m = " + m + ", n = " + n);
            }
        } else {
            n = 0;
            m = 0;
            System.out.println("m = " + m + ", n = " + n);
        }
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}