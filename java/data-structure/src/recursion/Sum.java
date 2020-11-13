package recursion;

public class Sum {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,10,11};
        System.out.println(sum(arr,0));
    }

    /**
     * sum [l, length) [0,1,2,3,4,5) == [0,1,2,3,4]  length ==5
     * @param arr
     * @param l
     * @return
     */
    public static int sum(int[] arr, int l) {
        //5 --> 0 (4 --> 4)
        if (l == arr.length) return 0;
        return arr[l] + sum(arr, l + 1);
    }

}
