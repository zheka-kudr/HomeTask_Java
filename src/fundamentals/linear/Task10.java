package fundamentals.linear;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        double x = getNum("x");
        double y = getNum("y");
        double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println("Result = " + result);
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}
