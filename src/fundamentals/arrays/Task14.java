package fundamentals.arrays;

import java.util.Scanner;

public class Task14 {
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
            int max = a[0];
            int min = a[1];
            for (int i = 0; i < num; i += 2) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
            for (int i = 1; i < num; i += 2) {
                if (a[i] < min) {
                    min = a[i];
                }
            }
            System.out.println("Max for even index = " + max + ", min for odd index = " + min);
        }
    }
}
