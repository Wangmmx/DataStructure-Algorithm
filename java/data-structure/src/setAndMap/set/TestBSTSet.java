package setAndMap.set;

import setAndMap.set.BSTSet;

public class TestBSTSet {
    public static void main(String[] args) {
        BSTSet<String> bstSet = new BSTSet<>();
        for (int i = 0; i < 10; i++) {
            bstSet.add("aaa" +i);
        }
        System.out.println(bstSet.getSize());
        bstSet.add("aaa0");
        System.out.println(bstSet.getSize());
        bstSet.add("aaa323");
        System.out.println(bstSet.getSize());

    }
}
