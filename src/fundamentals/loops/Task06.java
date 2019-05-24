package fundamentals.loops;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive num: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to " + num + " = " + sum);
    }
}
