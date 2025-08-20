package Arrays;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // matrix
        /*
        1 2 3 // 0th index
        4 5 6 // 1st index
        7 8 9 // 2nd index
         */

        // adding number of columns is not mandatory
        int[][] arr = new int[3][2];

        // input
        for (int row = 0; row < arr.length ; row++) {
            // for each column in every row
            for(int col = 0 ; col < arr[row].length ; col++){
                arr[row][col] = input.nextInt();
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println(); // new line after each row
        }



    }
}
