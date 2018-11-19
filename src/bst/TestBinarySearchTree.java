package bst;

public class TestBinarySearchTree {
    public static void main(String[] args) {
        int[] nums = {62,31,22,46,17,53,42};
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        for (int i = 0; i < nums.length; i++) {
            bst.add(nums[i]);
        }
        /**
         * toString()
         */
        System.out.println("------------toString------------");
        System.out.println(bst);
        System.out.println();

        /**
         * 三种遍历
         */
        System.out.println("------------前序遍历------------");
        bst.preOrder();
        System.out.println();

        System.out.println("------------中序遍历------------");
        bst.inOrder();
        System.out.println();

        System.out.println("------------后序遍历------------");
        bst.postOrder();
        System.out.println();

        System.out.println("------------非递归前序遍历------------");
        bst.preOrderNR();

        System.out.println("-----------层序遍历-----------");
        bst.levelOrder();

        System.out.println("-----------min-----------");
        System.out.println(bst.min());
        System.out.println("-----------max-----------");
        System.out.println(bst.max());

        bst.removeMin();
        System.out.println("-----------after remove min----------");
        bst.inOrder();

        bst.removeMax();
        System.out.println("-----------after remove max----------");
        bst.inOrder();
    }
}
