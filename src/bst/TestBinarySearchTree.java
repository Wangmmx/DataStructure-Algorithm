package bst;

public class TestBinarySearchTree {
    public static void main(String[] args) {
        int[] nums = {62,31,22,46,17,53,42};
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        for (int i = 0; i < nums.length; i++) {
            bst.add(nums[i]);
        }
        System.out.println(bst);
        System.out.println();

        bst.preOrder();
        System.out.println();

        bst.inOrder();
        System.out.println();

        bst.postOrder();
        System.out.println();

    }
}
