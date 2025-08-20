package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InputForLoop {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);

        // input using for loop
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        // printing using for loop
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(arr));
    }
}
