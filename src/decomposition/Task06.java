package decomposition;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = sc.nextInt();
        System.out.println("Hexagon square = " + countHexagonSquare(a));
    }

    private static Double countHexagonSquare(int a) {
        return (6 * Math.pow(a, 2) * Math.sqrt(3) / 4);
    }
}
