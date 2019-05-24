package fundamentals.linear;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        double v = getNum("v in km/h");     //v of a boat
        double v1 = getNum("v1 in km/h");  //v of river
        double t1 = getNum("t1 in h");
        double t2 = getNum("t2 in h");   //vs river flow

        double byLake = v * t1;
        double vsLake = (v - v1) * t2;
        System.out.println("By lake = " + byLake + " km");
        System.out.println("Vs lake = " + vsLake + " km");
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}
