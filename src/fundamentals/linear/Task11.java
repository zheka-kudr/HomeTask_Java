package fundamentals.linear;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        double a = getNum("a");
        double b = getNum("b");
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hypotenuse = " + c);
        System.out.println("Perimeter = " + (a + b + c));
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}