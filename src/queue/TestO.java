package queue;

import java.util.Random;

public class TestO {

    private static double testQueue(Queue<Integer> queue, int opCount) {
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            queue.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            queue.dequeue();
        }
        long endTime = System.nanoTime();
        return (endTime-startTime)/1000000000.0;
    }

    public static void main(String[] args) {
        int opCount = 100000;
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        System.out.println("ArrayQueue: " + testQueue(arrayQueue, opCount));
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        System.out.println("LoopQueue: " + testQueue(loopQueue, opCount));
    }

}
