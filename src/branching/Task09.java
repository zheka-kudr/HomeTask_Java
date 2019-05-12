package branching;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ");
        int a = sc.nextInt();
        System.out.print("Enter b ");
        int b = sc.nextInt();
        System.out.print("Enter c ");
        int c = sc.nextInt();
        if (a == b) {
            System.out.println("Triangle is equilateral");
        } else if (b == c) {
            System.out.println("Triangle is equilateral");
        } else if (a == c) {
            System.out.println("Triangle is equilateral");
        } else {
            System.out.println("Triangle is not equilateral");
        }
    }
}