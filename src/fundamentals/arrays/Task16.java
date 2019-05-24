package fundamentals.arrays;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of elements ");
        int num = sc.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter element " + i + " ");
            a[i] = sc.nextInt();
        }
        if (num > 1) {
            int max = a[0] + a[1];
            for (int i = 1; i < num - 1; i += 2) {
                int i1 = a[i] + a[i + 1];
                if (i1 > max) {
                    max = i1;
                }
            }
            System.out.println("Max  = " + max);
        }
    }
}