package main.sort;


public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {12,33,54,26,78,57,99};
        doInsertionSortOn2(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n" + "isSorted: " + isSorted(nums));
        int[] nums2 = {32,42,85,23,77,54,98};
        doInsertionSort(nums2);
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println("\n" + "isSorted: " + isSorted(nums2));
    }

    //n2时间复杂度
    public static void doInsertionSortOn2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j --) {
                int temp = arr[j];
                arr[j] = arr[j -1];
                arr[j -1] = temp;
            }
        }
    }

    public static void doInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //应该插入的位置
            int j;
            int temp = arr[i];
            for ( j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) return false;
        }
        return true;
    }

}
