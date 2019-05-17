package decomposition;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int a = getNum("A");
        int b = getNum("B");
        int c = getNum("C");
        int d = getNum("D");
        System.out.println("Greatest common factor = " + greatestCommonDivisor(a, b, c, d));
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }

    private static Integer greatestCommonDivisor(int a, int b, int c, int d) {
        int gcf = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                gcf = i;
            }
        }
        return gcf;
    }
}

