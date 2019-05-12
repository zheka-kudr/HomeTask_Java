package linear;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        System.out.println("Enter num of bits");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double myByte = num / 8;
        double kilobytes = myByte / 1024;
        double megabytes = kilobytes / 1024;
        double gigabytes = megabytes / 1024;
        System.out.println("Byte - " + myByte + "\nKilobytes - " + kilobytes + "\nMegabytes - " + megabytes + "\nGigabytes - " + gigabytes);
    }
}
