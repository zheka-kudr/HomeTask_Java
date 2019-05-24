package fundamentals.arrays;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of elements ");
        int num = sc.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter element " + i + " ");
            a[i] = sc.nextInt();
        }
        if (num > 0) {
            System.out.print("Enter c ");
            int c = sc.nextInt();
            System.out.print("Enter d ");
            int d = sc.nextInt();
            if (d > c && d < num && (d - c) > 0 && c > 0) {
                for (; c <= d; c++) {
                    System.out.println(a[c]);
                }
            } else {
                System.out.println("Bad data");
            }
        }
    }
}
