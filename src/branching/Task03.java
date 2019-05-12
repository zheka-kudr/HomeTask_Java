package branching;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num");
        int y = sc.nextInt();
        if (y < 3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
