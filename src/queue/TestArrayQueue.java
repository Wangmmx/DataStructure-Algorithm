package queue;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>(20);
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i);
            if (i%3 ==2) {
                queue.dequeue();
            }
            System.out.println(queue);
        }
    }
}
