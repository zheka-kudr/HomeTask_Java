package fundamentals.arrays;

import java.util.Scanner;

public class Task20 {
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
            if (num % 2 != 0) {
                for (int i = 1; i <= num / 2; i++) {
                    a[i] = a[i * 2];
                }
                for (int i = num / 2 + 1; i < num; i++) {
                    a[i] = 0;
                }
                System.out.println();
                for (int i = 0; i < num; i++) {
                    System.out.println(a[i] + " ");
                }
            }
            if (num % 2 == 0) {
                for (int i = 1; i < num / 2; i++) {
                    a[i] = a[i * 2];
                }
                for (int i = num / 2; i < num; i++) {
                    a[i] = 0;
                }
                System.out.println();
                for (int i = 0; i < num; i++) {
                    System.out.println(a[i] + " ");
                }
            }

        }
    }
}
