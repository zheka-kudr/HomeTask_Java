package linear;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Double num = getNum("num");
        int x = num.intValue();
        double y = (num - x) * 1000;
        System.out.println(Math.round(y) + "." + x);
    }

    private static Double getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextDouble();
    }
}
