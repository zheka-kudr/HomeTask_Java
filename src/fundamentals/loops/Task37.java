package fundamentals.loops;

public class Task37 {
    public static void main(String[] args) {
        int x;
        int y;
        for (int num1 = 10; num1 < 100; num1++) {
            for (int num2 = 10; num2 < 100; num2++) {
                x = num1 * 100 + num2;
                y = num2 * 100 + num1;
                if ((x % 99 == 0) && (y % 49 == 0)) {
                    System.out.println("Num1 = " + num1 + ", num2 = " + num2);
                }
            }
        }
    }
}
