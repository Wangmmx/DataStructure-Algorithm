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
        if (isEmpty()) {
            throw new IllegalArgumentException("Failed, queue is empty");
        }
        return data[front];
    }

    @Override
    public void enqueue(E e) {
        if((tail +1) % data.length == front) {
            resize(2*getCapacity());
        }
        data[tail] = e;
        tail = (tail+1)%data.length;
        size++;
    }

    @Override
    public E dequeue() {
        if(isEmpty())
           throw new IllegalArgumentException("Failed, queue is empty");
        E ret = data[front];
        data[front] = null;
        front = (front+1) % data.length;
        size--;
        if (size == data.length/4 && data.length/2 != 0) {
            resize(data.length/2);
        }
        return ret;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("LoopQueue: size = %d, capacity = %d \n", size, getCapacity()));
        sb.append("front [");
        for (int i = front; i != tail; i = (i+1) % data.length) {
            sb.append(data[i]);
            if ((i+1)%data.length != tail)
                sb.append(", ");
        }
        sb.append("] tail");
        return sb.toString();
    }

    private void resize(int newCapacity) {
        E[] newData = (E[])new Object[newCapacity +1];
        for (int i = 0; i < size; i ++) {
            newData[i] = data[(i+front)%data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }
}
