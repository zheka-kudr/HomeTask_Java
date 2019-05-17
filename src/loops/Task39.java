package loops;

public class Task39 {
    public static void main(String[] args) {
        for (int num = 100; num < 1000; num++) {
            if (num == (num % 100) * 7) {
                System.out.println("Number = " + num);
            }
        }
    }
}
