package fundamentals.linear;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        System.out.println("Enter char");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        System.out.println("Previous char - " + --ch);
        ch++;
        System.out.println("Next char - " + ++ch);
    }
}
