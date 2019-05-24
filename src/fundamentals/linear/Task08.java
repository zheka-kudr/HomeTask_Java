package fundamentals.linear;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        double a = getNum("a");
        double b = getNum("b");
        double c = getNum("c");
        double result = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
        System.out.println("Result = " + result);
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}
