package Functions;

import java.util.Scanner;

public class FuncIntro {
    public static void main(String[] args) {
        sumNum();
    }

    static void sumNum(){
        Scanner in = new Scanner(System.in);
        int num1, num2, res;
        System.out.print("Enter num1: ");
        num1 = in.nextInt();
        System.out.print("Enter num2: ");
        num2 = in.nextInt();
        res = num1+num2;
        System.out.println("Sum is: " + res);
    }

}
