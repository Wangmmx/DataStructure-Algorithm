package queue;

public class TestLinkedListQueue {
    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        for (int i = 0; i < 15; i++) {
            queue.enqueue(i);
            if (i%3 ==2) {
                queue.dequeue();
            }
            System.out.println(queue);
        }
    }
}
