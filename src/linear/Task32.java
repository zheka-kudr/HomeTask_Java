package linear;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        int h = getNum("h");
        int m = getNum("m");
        int s = getNum("s");
        System.out.println("Current time - " + h + ":" + m + ":" + s);

        System.out.println("Enter time to add");
        int h2 = getNum("h");
        int m2 = getNum("m");
        int s2 = getNum("s");

        int addMin = (s + s2) / 60;
        int addH = (m + m2) / 60;

        int h3 = (h + h2 + addH) % 24;
        int m3 = (m + m2 + addMin) % 60;
        int s3 = (s + s2) % 60;
        System.out.println("Current time - " + h3 + ":" + m3 + ":" + s3);

    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }

}
