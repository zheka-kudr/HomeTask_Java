package fundamentals.loops;

public class Task12 {
    public static void main(String[] args) {
        int a = 1;
        long sum = 1;
        for (int i = 1; i < 3; i++) {
            a = 6 + a;
            sum *= a;
        }
        System.out.println("Sum = " + sum);
    }
}
