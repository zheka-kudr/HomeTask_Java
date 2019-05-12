package branching;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of petals ");
        int x = sc.nextInt();
        if (x > 0) {
            if (x % 2 == 1) {
                System.out.println("Loves");
            } else {
                System.out.println("Doesn't love");
            }
        } else {
            System.out.println("Negative num");
        }
    }
}
