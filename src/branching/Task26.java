package branching;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        int a = getNum("a");
        int b = getNum("b");
        int c = getNum("c");
        int min = a;
        int max = a;
        if (b < min) {
            min = b;
        }
        if (b > max) {
            max = b;
        }
        if (c < min) {
            min = c;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Sum of biggest and smallest num = " + (max + min));
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}
