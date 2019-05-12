package branching;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ");
        int a = sc.nextInt();
        System.out.print("Enter b ");
        int b = sc.nextInt();
        System.out.print("Enter c ");
        int c = sc.nextInt();
        if (a <= 0) {
            System.out.println(Math.pow(a, 4));
        } else {
            System.out.println(Math.pow(a, 2));
        }
        if (b <= 0) {
            System.out.println(Math.pow(b, 4));
        } else {
            System.out.println(Math.pow(b, 2));
        }
        if (c <= 0) {
            System.out.println(Math.pow(c, 4));
        } else {
            System.out.println(Math.pow(c, 2));
        }
    }
}