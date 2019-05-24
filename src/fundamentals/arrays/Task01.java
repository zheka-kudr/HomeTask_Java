package fundamentals.arrays;

public class Task01 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 8, 15, 1, 2, 56};
        int sum = 0;
        for (int value : a) {
            if (value % a.length == 0) {
                sum += value;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
