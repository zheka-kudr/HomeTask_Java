package fundamentals.branching;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ");
        double a = sc.nextDouble();
        System.out.print("Enter b ");
        double b = sc.nextDouble();
        if (a < b) {
            a = (a + b) / 2;
            System.out.println("New a = " + a);
            b = 2 * a * b;
            System.out.println("New b = " + b);
        } else {
            a = 2 * a * b;
            System.out.println("New a = " + a);
            b = (a + b) / 2;
            System.out.println("New b = " + b);
        }
    }
}
