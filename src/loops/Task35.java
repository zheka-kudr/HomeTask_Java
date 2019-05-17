package loops;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int x = sc.nextInt();
        int count = 0;
        while (x != 0) {
            if (x % 2 == 0) {
                count++;
            }
            x /= 10;
        }
        System.out.println("Number of even numbers = " + count);
    }
}
