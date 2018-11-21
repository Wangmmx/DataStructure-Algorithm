package setAndMap.set;

import java.util.Random;

public class TestO_bst_linkedList {
    private static double testSet(Set<Integer> set, int opCount) {
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            set.add(random.nextInt(Integer.MAX_VALUE));
        }
        long endTime = System.nanoTime();
        return (endTime-startTime)/1000000000.0;
    }

    public static void main(String[] args) {
        int opCount = 100000;
        LinkedListSet<Integer> listSet = new LinkedListSet<>();
        System.out.println("LinkedListSet: " + testSet(listSet, opCount));
        BSTSet<Integer> bstSet = new BSTSet<>();
        System.out.println("BSTSet: " + testSet(bstSet, opCount));
    }

}
