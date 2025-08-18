package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // variable number of arguments
        //Java collects those numbers into an array of int.
        fun(2,3,4,5,6,7); // fun(new int[]{2,3,4,5,6,7});

    }

    // The function fun can take any number of int arguments
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
