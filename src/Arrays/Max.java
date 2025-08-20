package Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,2,8,4,5,6};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int max_so_far = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > max_so_far) {
                max_so_far = j;
            }
        }

        return max_so_far;
    }
}
