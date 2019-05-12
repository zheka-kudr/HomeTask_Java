package arrays;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of elements ");
        int num = sc.nextInt();
        int[] a = new int[num];
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Enter element " + i + " ");
            a[i] = sc.nextInt();
            if (a[i] > 0) {
                positive++;
            }
            if (a[i] < 0) {
                negative++;
            }
            if (a[i] == 0) {
                zeros++;
            }
        }
        System.out.println("Number of positive numbers = " + positive);
        System.out.println("Number of negative numbers = " + negative);
        System.out.println("Number of zero = " + zeros);
    }
}
