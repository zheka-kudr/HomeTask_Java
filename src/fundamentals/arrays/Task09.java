package fundamentals.arrays;

import java.util.Scanner;

public class Task09 {
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
            int max = a[0];
            int min = a[0];
            int maxIndex = 0;
            int minIndex = 0;
            for (int i = 0; i < num; i++) {
                if (a[i] > max) {
                    max = a[i];
                    maxIndex = i;
                }
                if (a[i] < min) {
                    min = a[i];
                    minIndex = i;
                }
            }
            for (int i = 0; i < num; i++) {
                System.out.printf("%-5d", a[i]);
            }
            if (maxIndex != minIndex) {
                int temp = a[maxIndex];
                a[maxIndex] = a[minIndex];
                a[minIndex] = temp;
            }
            System.out.println();
            for (int i = 0; i < num; i++) {
                System.out.printf("%-5d", a[i]);
            }
        }
    }

}