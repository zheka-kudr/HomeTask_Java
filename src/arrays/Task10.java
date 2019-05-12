package arrays;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of elements ");
        int num = sc.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter element " + i + " ");
            a[i] = sc.nextInt();
        }
        System.out.println("Only elements where a[i] > i");
        for (int i = 0; i < num; i++) {
            if (a[i] > i) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
