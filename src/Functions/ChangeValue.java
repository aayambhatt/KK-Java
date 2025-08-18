package Functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};      // arr is a reference to an array object

        change(arr);                  // pass reference copy to method
        System.out.println(Arrays.toString(arr)); // print modified array

    }

    static void change(int[] nums){
        nums[0] = 99;                 // modifying the object content
    }
}

