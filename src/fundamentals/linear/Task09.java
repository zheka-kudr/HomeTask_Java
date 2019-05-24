package fundamentals.linear;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        double a = getNum("a");
        double b = getNum("b");
        double c = getNum("c");
        double d = getNum("d");
        double result = ((a / c) * (b / d)) - (((a * b) - c) / (c * d));
        System.out.println("Result = " + result);
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}