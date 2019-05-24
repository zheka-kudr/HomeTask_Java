package fundamentals.loops;

public class Task13 {
    public static void main(String[] args) {
        for (double x = -5; x <= 5; x += 0.5) {
            double y = 5 - (Math.pow(x, 2) / 2);
            System.out.println("y[" + x + "] = " + y);
        }
    }
}