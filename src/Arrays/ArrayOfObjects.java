package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        String[] str = new String[4];
        Scanner input = new Scanner(System.in);

        // input
        for(int i = 0 ; i < str.length ; i++){
            str[i] = input.next();
        }

        for (String s : str) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("Another way to print String array: " + Arrays.toString(str));
    }
}
