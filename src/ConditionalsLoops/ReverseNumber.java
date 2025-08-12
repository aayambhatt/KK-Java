package ConditionalsLoops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        int revNum = 0;

        while(num>0){
           int lastDigit = num % 10;
           revNum = revNum*10 + lastDigit;
           num = num / 10;
        }

        System.out.println("Reversed Number is: " + revNum);
    }
}
