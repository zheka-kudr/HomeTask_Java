package branching;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ");
        int a = sc.nextInt();
        System.out.print("Enter b ");
        int b = sc.nextInt();
        if (Math.pow(a, 2) > Math.pow(b, 2)) {
            System.out.println(b + "^2 is less");
        } else if (Math.pow(a, 2) < Math.pow(b, 2)) {
            System.out.println(a + "^2 is less");
        } else if (a == b) {
            System.out.println("a = b");
        }
    }
}
