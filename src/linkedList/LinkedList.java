package linkedList;

public class LinkedList<E> {
    /**
     * 定义内部类 Node
     */
    private class Node {
        public E e;
        public Node next;

        public Node() {
            this(null, null);
        }

        public Node(E e) {
            this(e, null);
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

    private Node dummyHead;
    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public Node getHead() {
        return dummyHead;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在头部添加元素
     *
     * @param e
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * 在末尾添加元素
     *
     * @param e
     */
    public void addLast(E e) {
        add(size, e);
    }

    /**
     * 在指定位置添加元素
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed, index out of range");
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node node = new Node(e);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Add failed, index out of range");
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size - 1);
    }

    public void set(int index, E e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Add failed, index out of range");
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    public Boolean contains(E e) {
        if (isEmpty()) return false;
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e.equals(e)) return true;
            cur = cur.next;
        }
        return false;
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Add failed, index out of range");
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node delNode = prev.next;
        prev.next = delNode.next;
        delNode.next = null;
        size--;
        return delNode.e;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    /**
     * 删除指定元素 这个不对要改
     * @param e
     */
    public void removeElement(E e) {
        if (isEmpty()) return;
        if (!contains(e)) return;
        Node prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.e == e) {
                prev.next = prev.next.next;
               // prev.next.next = null;
                size--;
            }
            prev = prev.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node cur = dummyHead.next; cur != null; cur = cur.next) {
            sb.append(cur + "->");
        }
        sb.append("Null");
        return sb.toString();
    }
}
