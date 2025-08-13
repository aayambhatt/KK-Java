package ConditionalsLoops;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        int salary = input.nextInt();

        if(salary>50000){
            System.out.println("You should invest + save + plan");
        }
        else{
            System.out.println("Focus on savings and money management");
        }

    }
}
