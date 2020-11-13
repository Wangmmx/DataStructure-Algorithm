package main.sort;

//nlogn
public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {12,33,54,26,78,57,99};
        doMergeSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n" + "isSorted: " + isSorted(nums));
    }

    public static void doMergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length -1);
    }

    //对[l,r]闭区间进行排序
    private static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = (l + r)/2;//溢出怎么解决？
        mergeSort(arr, l, mid);
        mergeSort(arr,mid+1, r);
        merge(arr, l, mid, r);
    }

    //[l,mid] 和【mid+1,r]两个部分进行归并
    private static void merge(int[] arr, int l, int mid, int r) {
        int[] temp = new int[r-l+1];
        //从0开始-> i 从l开始-> i-l
        for (int i = l; i <= r ; i++) {
            temp[i-l] = arr[i];
        }
        int i = l, j = mid +1;
        for (int k = l; k <= r ; k++) {
            if (i > mid) {
                arr[k] = temp[j-l];
                j++;
            } else if (j > r) {
                arr[k] = temp[i-l];
                i++;
            }
            else if (temp[i-l] < temp[j-l]) {
                arr[k] = temp[i-l];
                i++;
            } else {
                arr[k] = temp[j-l];
                j++;
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
