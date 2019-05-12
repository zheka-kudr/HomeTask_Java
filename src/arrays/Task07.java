package arrays;

import java.util.Scanner;

public class Task07 {
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
            System.out.print("Enter Z ");
            int z = sc.nextInt();
            int count = 0;
            for (int i = 0; i < num; i++) {
                if (a[i] > z) {
                    a[i] = z;
                    count++;
                }
                System.out.print(a[i] + " ");
            }
            System.out.println("Number of changes = " + count);
        }
    }
}
