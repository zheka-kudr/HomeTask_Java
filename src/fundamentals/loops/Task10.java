package fundamentals.loops;

public class Task10 {
    public static void main(String[] args) {
        long sum = 1;
        for (int i = 1; i < 201; i++) {
            sum *= Math.pow(i, 2);
        }
        System.out.println("Sum = " + sum);
    }
}
