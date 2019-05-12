package linear;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        int M = getNum("M");
        int N = getNum("N");
        int x = M / N;
        double cos = (double) M / (double) N;
        double secondDigit = cos - x;
        int numBeforeDot = (int) cos - (int) secondDigit;
        int length = (int) (Math.log10(numBeforeDot) + 1);
        int numAfterDot = (int) (numBeforeDot / Math.pow(10, length - 1));
        System.out.println("Num before . = " + numAfterDot + " Num after . = " + (int) (secondDigit * 10));
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}
