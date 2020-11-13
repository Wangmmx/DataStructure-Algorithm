package main.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {12,33,54,26,78,57,99};
        doBubbleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n" + "isSorted: " + isSorted(nums));
    }

    public static void doBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length -1 -i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j +1] = temp;
                }
            }
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) return false;
        }
        return true;
    }

}
