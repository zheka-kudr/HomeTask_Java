package fundamentals.linear;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        double r = getNum("r");
        double area = Math.PI * Math.pow(r, 2);
        double length = 2 * Math.PI * r;
        System.out.println("Length = " + length);
        System.out.println("Area = " + area);
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}
