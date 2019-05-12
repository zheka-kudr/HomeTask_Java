package branching;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        int a = getNum("a");
        int b = getNum("b");
        int c = getNum("c");
        if ((a + b > 0) || (b + c > 0) || (a + c > 0)) {
            System.out.println("Positive sum was found");
        } else {
            System.out.println("Positive sum wasn't found");
        }
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}
