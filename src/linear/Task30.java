package linear;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        double R1 = getNum("R1");
        double R2 = getNum("R2");
        double R3 = getNum("R3");
        double R = 1 / R1 + 1 / R2 + 1 / R3;
        System.out.println("R = " + 1 / R);
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}
