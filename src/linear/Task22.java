package linear;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        int T = getNum("T");
        if (T > 0) {
            int h = T / 3600;
            int m = (T - (h * 3600)) / 60;
            int s = T - (h * 3600) - (m * 60);
            System.out.println(h + "h" + m + "m" + s + "s");
        }
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}
