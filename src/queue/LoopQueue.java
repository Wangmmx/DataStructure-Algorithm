package queue;

public class LoopQueue<E> implements Queue<E>{

    private E[] data;
    private int size;
    private int front;
    private int tail;

    public LoopQueue() {
       this(10);
    }

    public LoopQueue(int capacity) {
        data = (E[])new Object[capacity+1];
        size = 0;
        front = 0;
        tail = 0;
    }

    public int getCapacity() {
        return data.length-1;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public E getFront() {
        return null;
    }

    @Override
    public void enqueue(E e) {

    }

    @Override
    public E dequeue() {
        return null;
    }
}
