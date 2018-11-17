package bst;

public class BinarySearchTree<E> {

    private class Node {
         E e;
         Node left;
         Node right;

        public Node(E e, Node left, Node right) {
            this.e = e;
            this.left = left;
            this.right = right;
        }

        public Node() {
            this(null, null, null);
        }
    }

    public Node root;
    public int size;

    public BinarySearchTree() {
        this.root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public Node getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
