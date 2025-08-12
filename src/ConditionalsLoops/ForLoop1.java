package ConditionalsLoops;

import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {
        // print number 1 to 5
        for(int i = 1 ; i <=5 ; i++){
            System.out.println(i);
        }
        System.out.println("___________________________________________________");
        // print numbers from 1 to n
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        for(int i = 1 ; i<=n ; i++){
            System.out.print(i + " ");
        }
    }

}
