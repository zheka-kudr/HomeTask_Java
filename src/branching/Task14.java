package branching;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle 1 ");
        int a = sc.nextInt();
        System.out.print("Enter angle 2 ");
        int b = sc.nextInt();
        if (a + b < 180) {
            System.out.println("Triangle with angles " + a + "," + b + " exists");
            if ((a + b) == 90) {
                System.out.println("Triangle with angles " + a + "," + b + " is rectangular");
            }
        }

    }
}
