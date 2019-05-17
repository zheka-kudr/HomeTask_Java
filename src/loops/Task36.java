package loops;

public class Task36 {
    public static void main(String[] args) {
        int x;
        for (int num1 = 10; num1 < 100; num1++) {
            for (int num2 = 10; num2 < 100; num2++) {
                x = num1 * 100 + num2;
                if (x % (num1 * num2) == 0) {
                    System.out.println("Num1 = " + num1 + ", num2 = " + num2);
                }
            }
        }
    }
}
