package main.sort;

import static main.sort.BubbleSort.doBubbleSort;
import static main.sort.InsertionSort.doInsertionSort;
import static main.sort.InsertionSort.doInsertionSortOn2;
import static main.sort.MergeSort.doMergeSort;
import static main.sort.SelectionSort.doSelectionSort;
import static main.sort.ShellSort.doShellSort;


public class TestDemo {
    public static int[] createRandomArray() {
        int n = 50000;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = (int)(Math.random()*n +1);
        }
        return nums;
    }

    public static void main(String[] args) {
        //selection
        int[] nums = createRandomArray();
        int[] nums2 = nums.clone();
        int[] nums3 = nums.clone();
        int[] nums4 = nums.clone();
        int[] nums5 = nums.clone();
        int[] nums6 = nums.clone();

        long staartTime = System.nanoTime();
        doSelectionSort(nums);
        long endTime = System.nanoTime();
        double time = (endTime - staartTime)/1000000000.0;
        System.out.println("selectionSort: " + time + "s");

        //insertion
        long staartTime2 = System.nanoTime();
        doInsertionSortOn2(nums2);
        long endTime2 = System.nanoTime();
        double time2 = (endTime2 - staartTime2)/1000000000.0;
        System.out.println("insertionSort: " + time2 + "s");

        //insertion
        long staartTime3 = System.nanoTime();
        doInsertionSort(nums3);
        long endTime3 = System.nanoTime();
        double time3 = (endTime3 - staartTime3)/1000000000.0;
        System.out.println("insertionSort: " + time3 + "s");

        //bubble
        long staartTime4 = System.nanoTime();
        doBubbleSort(nums4);
        long endTime4 = System.nanoTime();
        double time4 = (endTime4 - staartTime4)/1000000000.0;
        System.out.println("bubbleSort:    " + time4 + "s");

        //shell
        long staartTime5 = System.nanoTime();
        doShellSort(nums5);
        long endTime5 = System.nanoTime();
        double time5 = (endTime5 - staartTime5)/1000000000.0;
        System.out.println("shellSort:     " + time5 + "s");

        //merge
        long staartTime6 = System.nanoTime();
        doMergeSort(nums6);
        long endTime6 = System.nanoTime();
        double time6 = (endTime6 - staartTime6)/1000000000.0;
        System.out.println("mergeSort:     " + time6 + "s");
    }

}
