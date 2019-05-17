package decomposition;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int a = getNum("A");
        int b = getNum("B");
        int gcf = greatestCommonDivisor(a, b);
        System.out.println("Greatest common factor = " + gcf);
        int lcm = leastCommonMultiple(a, b, gcf);
        System.out.println("Least common multiple = " + lcm);

    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }

    private static Integer greatestCommonDivisor(int a, int b) {
        int gcf = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0 && b % i == 0) {
                gcf = i;
            }
        }
        return gcf;
    }

    private static Integer leastCommonMultiple(int a, int b, int gcf) {
        return (a * b) / gcf;
    }
}
