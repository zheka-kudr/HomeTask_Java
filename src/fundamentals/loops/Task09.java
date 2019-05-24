package fundamentals.loops;

public class Task09 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("Sum = " + sum);
    }
}