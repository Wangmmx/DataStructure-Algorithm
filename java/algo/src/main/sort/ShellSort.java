package main.sort;

public class ShellSort {
    public static void main(String[] args) {
        int[] nums = {12,33,54,26,78,57,99};
        doShellSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n" + "isSorted: " + isSorted(nums));
    }

    public static void doShellSort(int[] arr) {
        for (int h = arr.length / 2; h > 0; h /= 2) {
            //从增量那组开始进行插入排序，直至完毕
            for (int i = h; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                // j - step 就是代表与它同组隔壁的元素
                while (j - h >= 0 && arr[j - h] > temp) {
                    arr[j] = arr[j - h];
                    j = j - h;
                }
                arr[j] = temp;
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
