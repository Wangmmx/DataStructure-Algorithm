package queue;

import linkedList.LinkedList;

public class LinkedListQueue<E> implements Queue<E> {
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

    private Node head;
    private Node tail;
    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E getFront() {
        if (isEmpty()) throw new IllegalArgumentException("Get failed, queue is empty");
        return head.e;
    }

    /**
     * 入队 从链表尾部进
     * @param e
     */
    @Override
    public void enqueue(E e) {
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    /**
     * 出队 从链表头部出
     * @return
     */
    @Override
    public E dequeue() {
         if (isEmpty()) throw new IllegalArgumentException("Dequeue failed, queue is empty");
         Node retNode = head;
         head = head.next;
         retNode.next = null;
         if (head.next == null) {
             head = null;
             tail = null;
         }
         size--;
         return retNode.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LinkedListQueue: front ");
        for (Node cur = head ;cur != null ; cur = cur.next) {
            sb.append(cur + "->");
        }
        sb.append("Null");
        return sb.toString();
    }

}
