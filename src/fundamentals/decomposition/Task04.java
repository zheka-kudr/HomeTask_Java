package fundamentals.decomposition;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        int a = getNum("A");
        int b = getNum("B");
        int c = getNum("C");
        System.out.println("Least common multiple = " + leastCommonMultipleFor3(a, b, c));
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }

    private static Integer greatestCommonDivisor(int a, int b) {
        int gcf = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                gcf = i;
            }
        }
        return gcf;
    }

    private static Integer leastCommonMultiple(int a, int b, int gcf) {
        return (a * b) / gcf;
    }

    private static Integer leastCommonMultipleFor3(int a, int b, int c) {
        int gcfab = greatestCommonDivisor(a, b);
        int lcmab = leastCommonMultiple(a, b, gcfab);
        int gcf = greatestCommonDivisor(lcmab, c);
        return leastCommonMultiple(lcmab, c, gcf);
    }
}
