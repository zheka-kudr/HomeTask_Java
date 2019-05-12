package arrays;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of elements ");
        int num = sc.nextInt();
        int[] a = new int[num];
        int j = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Enter element " + i + " ");
            a[i] = sc.nextInt();
        }
        for (int k = 0; k < num; k++) {
            if (a[k] > 0) {
                System.out.println("First met positive");
                break;
            }
            if (a[k] < 0) {
                System.out.println("First met negative");
                break;
            }
        }
    }
}
