package linear;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        double r = getNum("r");
        double R = getNum("R");
        if (R > r) {
            double S = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2));
            System.out.println("S = " + S);
        }
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}
