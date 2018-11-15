package linkedList;

public class LinkedList<E> {
    /**
     * 定义内部类 Node
     */
    private class Node {
        public E e;
        public Node next;

        public Node() {
            this.e = null;
            this.next = null;
        }

        public Node(E e) {
            this.e = e;
            this.next = null;
        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head;
    private int size;

    public int getSize() {
        return size;
    }

    public Node getHead() {
        return head;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在头部添加元素
     * @param e
     */
    public void addFirst(E e) {
       Node node = new Node();
       node.next = head;
       head = node;
       size++;
    }

    /**
     * 在末尾添加元素
     * @param e
     */
    public void addLast(E e) {
        add(size, e);
    }

    /**
     * 在指定位置添加元素
     * @param index
     * @param e
     */
    public void add(int index, E e) {

        if (index < 0 || index > size) throw new IllegalArgumentException("Add failed, index out of range");
        if (index == 0) addFirst(e);
        Node prev = head;
        for (int i = 0; i <index -1; i++) {
            prev = prev.next;
        }
        Node node = new Node();
        node.next = prev.next;
        prev.next = node;
        size++;
    }
}
