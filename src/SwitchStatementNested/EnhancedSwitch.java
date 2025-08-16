package SwitchStatementNested;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter fruit name: ");
        String fruit = input.next();

        fruit = fruit.toLowerCase();

        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("An apple a day keeps doctor away");
            case "orange" -> System.out.println("Best fruit for juice");
            default -> System.out.println("Not in our database. Enter Mango, Apple or Orange");
        }

        input.close();

    }
}
