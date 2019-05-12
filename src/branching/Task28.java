package branching;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        int a = getNum("a");
        int b = getNum("b");
        int c = getNum("c");
        int d = getNum("d");
        int i = 0;
        if (a == d) {
            i++;
            System.out.println("a=d");
        }
        if (b == d) {
            i++;
            System.out.println("b=d");
        }
        if (c == d) {
            i++;
            System.out.println("c=d");
        }
        if (i == 0) {
            int max = d - a;
            if (max < (d - b)) {
                max = d - b;
            }
            if (max < (d - c)) {
                max = d - c;
            }
            System.out.println("Max(d-a,d-b,d-c) = " + max);
        }
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}
