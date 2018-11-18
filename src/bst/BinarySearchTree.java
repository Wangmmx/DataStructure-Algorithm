package bst;

public class BinarySearchTree<E extends Comparable<E>>{


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

        public Node(E e) {
            this(e, null, null);
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

    public void add(E e) {
        if (this.isEmpty()) {
            root = new Node(e);
            size++;
        } else {
            add(root, e);
        }
    }

    private void add(Node node, E e) {
        if (e.equals(node.e)) return;
        if (e.compareTo(node.e) < 0 && node.left == null) {
                node.left = new Node(e);
                size++;
                return;
        } else if (e.compareTo(node.e) > 0 && node.right == null) {
            node.right = new Node(e);
            size++;
            return;
        }
        if (e.compareTo(node.e) < 0) add(node.left, e);
        if (e.compareTo(node.e) > 0) add(node.right, e);
        }


}
