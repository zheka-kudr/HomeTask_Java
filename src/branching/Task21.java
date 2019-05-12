package branching;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        char gender = getChar();
        if (gender == 'm') {
            System.out.println("I like men!");
        } else if (gender == 'w') {
            System.out.println("I like women!");
        }
    }

    private static char getChar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gender" + " ");
        return sc.next().charAt(0);
    }
}
