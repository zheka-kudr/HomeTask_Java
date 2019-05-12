package loops;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int a = getNum("a");
        int n = getNum("n");
        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum *= (a + i);
        }
        System.out.println("Sum = " + sum);
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}