package ConditionalsLoops;

import java.util.Scanner;

public class CountOccurances {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        System.out.print("Enter the digit you want occurances of: ");
        int n = input.nextInt();

        int count = 0;
        while(num >0){
            int lastDigit = num % 10;
            if(lastDigit==n){
                count++;
            }
            num = num / 10; // removing last digit to keep checking the whole number
        }

        System.out.println("Occurace of " + n + " is " + count);
        input.close();
    }
}
