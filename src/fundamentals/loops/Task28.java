package fundamentals.loops;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the 1st number: ");
            int firstNumber = sc.nextInt();

            System.out.print("Enter the 2nd number: ");
            int secondNumber = sc.nextInt();

            System.out.print("Enter the arithmetic sign: ");
            char sign = sc.next().charAt(0);
            int result;
            switch (sign) {
                case '+':
                    result = firstNumber + secondNumber;
                    System.out.println("Result: " + result);
                    break;

                case '-':
                    result = firstNumber - secondNumber;
                    System.out.println("Result: " + result);
                    break;

                case '*':
                    result = firstNumber * secondNumber;
                    System.out.println("Result: " + result);
                    break;

                case '/':
                    if (secondNumber == 0) {
                        System.out.println("Can't divide by 0");
                        break;
                    } else {
                        result = firstNumber / secondNumber;
                        System.out.println("Result: " + result);
                        break;
                    }

                case '0':
                    System.exit(0);
                default:
                    System.out.println("Bad sign");
            }
        }
    }
}
