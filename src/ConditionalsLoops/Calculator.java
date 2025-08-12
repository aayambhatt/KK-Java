package ConditionalsLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // take input till user does not press X or x
        int ans = 0;
        while(true){
            // take operator as input
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // input two numbers
                System.out.print("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if(op == '+'){
                    ans = num1+num2;
                }
                if(op == '-'){
                    ans = num1-num2;
                }
                if(op == '*'){
                    ans = num1*num2;
                }
                if(op == '/'){
                    if(num2 == 0){
                        System.out.println("Denominator cannot be 0!");
                    }
                    ans = num1/num2;
                }
                if(op == '%'){
                    ans = num1%num2;
                }

            }
            else if(op == 'x' || op == 'X'){
                System.out.println("Thanks for using our calculator!");
                break;
            }
            else{
                System.out.println("Invalid operations");
            }

            System.out.println("Output of calculation is: " + ans);
        }


    }
}
