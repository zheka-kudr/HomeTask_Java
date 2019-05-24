package fundamentals.linear;

public class Task15 {
    public static void main(String[] args) {
        System.out.println(pi(1));
        System.out.println(pi(2));
        System.out.println(pi(3));
        System.out.println(pi(4));
    }

    private static Double pi(int power) {
        return Math.pow(Math.PI, power);
    }
}
