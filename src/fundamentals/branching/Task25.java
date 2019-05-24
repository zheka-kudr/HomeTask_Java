package fundamentals.branching;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature ");
        int temperature = sc.nextInt();
        if (temperature > 60) {
            System.out.println("Fire situation");
        }
    }
}
