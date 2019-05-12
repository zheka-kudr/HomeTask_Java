package arrays;

import java.util.Scanner;

public class Task17 {
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
            int min = a[0];
            for (int i = 1; i < num; i++) {
                if (a[i] < min) {
                    min = a[i];
                }
            }
            System.out.println("min element in array = " + min);
            int count = 0;
            for (int i = 0; i < num; i++) {
                if (a[i] == min) {
                    count++;
                }
            }
            int[] b = new int[num - count];
            int j = 0;
            for (int i = 0; i < num; i++) {
                if (a[i] != min) {
                    b[j] = a[i];
                    System.out.println(b[j] + " ");
                    j++;
                }
            }
        }
    }
}