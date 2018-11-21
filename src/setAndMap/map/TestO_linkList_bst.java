package setAndMap.map;

import java.util.Random;

public class TestO_linkList_bst {
    private static double testMap(Map<Integer, String> map, int opCount) {
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            map.add(random.nextInt(Integer.MAX_VALUE), "aa"+random.nextInt(Integer.MAX_VALUE));
        }
        long endTime = System.nanoTime();
        return (endTime-startTime)/1000000000.0;
    }

    public static void main(String[] args) {
        int opCount = 10000;
        LinkedListMap<Integer, String> listMap = new LinkedListMap<>();
        System.out.println("LinkedListMap: " + testMap(listMap, opCount));
        BSTMap<Integer, String> bstMap = new BSTMap<>();
        System.out.println("BSTMap: " + testMap(bstMap, opCount));
    }


}
