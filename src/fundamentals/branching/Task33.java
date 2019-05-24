package fundamentals.branching;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        System.out.println("Enter password");
        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();
        switch (password) {
            case 9583:
            case 1747:
                System.out.println("Modules A,B,C");
                break;
            case 3331:
            case 7922:
                System.out.println("Modules B,C");
                break;
            case 9455:
            case 8997:
                System.out.println("Module C");
                break;

            default:
                System.out.println("Incorrect password");
        }
    }
}
