package loops;

public class Task15 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 1;
        for (int i = 1; i < 11; i++) {
            a *= 2;
            sum += a;
        }
        System.out.println("Sum = " + sum);
    }
}
