package branching;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        int a = getNum("a");
        int b = getNum("b");
        int c = getNum("c");
        int i = 0;
        if (a > 0) {
            i++;
        }
        if (b > 0) {
            i++;
        }
        if (c > 0) {
            i++;
        }
        System.out.println("Number of positive numbers = " + i);
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}