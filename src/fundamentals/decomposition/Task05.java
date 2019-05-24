package fundamentals.decomposition;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        int a = getNum("A");
        int b = getNum("B");
        int c = getNum("C");
        System.out.println("Sum of greatest and least numbers = " + (greatestOf3Num(a, b, c) + leastOf3Num(a, b, c)));
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }

    private static Integer greatestOf3Num(int a, int b, int c) {
        int max = a;
        if (b >= max) {
            if (c > b) {
                max = c;
            } else {
                max = b;
            }
        }
        return max;
    }

    private static Integer leastOf3Num(int a, int b, int c) {
        int min = a;
        if (b <= min) {
            if (c < b) {
                min = c;
            } else {
                min = b;
            }
        }
        return min;
    }
}
