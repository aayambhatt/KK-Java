package ConditionalsLoops;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // first two numbers
        int a = 0;
        int b = 1;
        int count = 3;

        while (count <= n) {
            int temp = b;  // remember old b
            b = b + a;     // new b is sum of a and b
            a = temp;      // a becomes old b
            count++;
        }


        System.out.println(b);

    }

}
