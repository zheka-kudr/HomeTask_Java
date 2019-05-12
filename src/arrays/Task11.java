package arrays;

import java.util.Scanner;

public class Task11 {
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
            System.out.print("Enter L ");
            int L = sc.nextInt();
            System.out.print("Enter M ");
            int M = sc.nextInt();
            if (L > 0 && ((M - 1) > L)) {
                for (int i = 0; i < num; i++) {
                    if (a[i] % M == L) {
                        System.out.print(a[i] + " ");
                    }
                }
            }
        }
    }
}