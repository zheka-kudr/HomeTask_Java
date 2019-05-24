package fundamentals.loops;

public class Task16 {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i < 11; i++) {
            sum *= i;
        }
        System.out.println("Sum = " + sum);
    }
}