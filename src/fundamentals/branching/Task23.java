package fundamentals.branching;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        int day = getNum("Day");
        int month = getNum("Month");
        if (day < 32 && day > 0) {
            if (month < 13 && month > 0) {
                System.out.println("Day = " + day + ", and month = " + month);
            } else {
                System.out.println("Bad month");
            }
        } else {
            System.out.println("Bad day");
        }
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}
