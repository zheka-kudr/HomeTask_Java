package arrays;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of elements ");
        int num = sc.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter element " + i + " ");
            a[i] = sc.nextInt();
        }
        int all = 1;
        for (int k = 1; k < num; k++) {
            if (a[k] > a[k - 1]) {
                all++;
            }
            if (all == num) {
                System.out.println("Increasing");
            }
        }
    }
}
