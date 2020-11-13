package main.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {12,33,54,26,78,57,99};
        doQuickSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n" + "isSorted: " + isSorted(nums));
    }

    public static void doQuickSort(int[] arr) {

    }



    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) return false;
        }
        return true;
    }
}
