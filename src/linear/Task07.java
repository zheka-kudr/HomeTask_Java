package linear;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        double square = 2 * Math.pow(width, 2);
        System.out.println("Square = " + square);
    }
}
