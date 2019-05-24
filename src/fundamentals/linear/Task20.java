package fundamentals.linear;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        double length = getNum("length");
        double S = Math.pow(length, 2) / (4 * Math.PI);
        System.out.println("S = " + S);
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}
