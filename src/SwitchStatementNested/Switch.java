package SwitchStatementNested;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter fruit name: ");
        String fruit = input.next();

        fruit = fruit.toLowerCase();

        switch (fruit){
            case "mango":
                System.out.println("King of fruits");
                break;
            case "apple":
                System.out.println("An apple a day keeps doctor away");
                break;
            case "orange":
                System.out.println("Best fruit for juice");
                break;

            default:
                System.out.println("Enter Mango, Apple or Orange");

        }

        input.close();

    }
}
