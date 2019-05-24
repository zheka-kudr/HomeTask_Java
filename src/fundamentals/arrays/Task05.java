package fundamentals.arrays;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of elements ");
        int num = sc.nextInt();
        int[] a = new int[num];
        int j = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Enter element " + i + " ");
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                j++;
            }
        }
        if (j > 0) {
            int[] b = new int[j];
            int r = 0;
            for (int k = 0; k < num; k++) {
                if (a[k] % 2 == 0) {
                    b[r] = a[k];
                    System.out.print(b[r] + " ");
                    r++;
                }
            }
        } else {
            System.out.println("No numbers divided by 2");
        }
    }
}
