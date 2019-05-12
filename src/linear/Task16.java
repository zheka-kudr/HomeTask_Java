package linear;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int r = getNum("r");
        if (r > 999 & r < 10000) {
            int result = (r % 10) * (r / 10 % 10) * (r / 100 % 10) * (r / 1000);
            System.out.println("Result = " + result);
        } else {
            System.out.println("Bad number");
        }
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}