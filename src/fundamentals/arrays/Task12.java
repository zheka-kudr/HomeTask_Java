package fundamentals.arrays;

import java.util.Scanner;

public class Task12 {
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
            int sum = 0;
            for (int i = 2; i < num; i++) {
                boolean isPrime = true;
                for (int k = 2; k < i; k++) {
                    if (i % k == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    sum += a[i];
                }
            }
            System.out.println("Sum = " + sum);
        }
    }
}