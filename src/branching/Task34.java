package branching;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        int cost = getNum("Cost");
        int money = getNum("Money");
        if (cost == money) {
            System.out.println("Thank you");
        } else if (money > cost) {
            System.out.println("Your change " + (money - cost));
        } else {
            System.out.println("Not enough money, add please " + (cost - money));
        }
    }

    private static Integer getNum(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + " ");
        return sc.nextInt();
    }
}
