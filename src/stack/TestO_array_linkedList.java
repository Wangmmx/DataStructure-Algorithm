package stack;

import java.util.Random;

public class TestO_array_linkedList {
    private static double testStack(Stack<Integer> stack, int opCount) {
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            stack.pop();
        }
        long endTime = System.nanoTime();
        return (endTime-startTime)/1000000000.0;
    }

    public static void main(String[] args) {
        int opCount = 10000;
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        System.out.println("ArrayStack: " + testStack(arrayStack, opCount));
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        System.out.println("LinkedListStack: " + testStack(linkedListStack, opCount));
    }
}
