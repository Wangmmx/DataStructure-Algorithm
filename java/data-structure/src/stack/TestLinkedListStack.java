package stack;

import linkedList.LinkedList;

public class TestLinkedListStack {
    public static void main(String[] args) {
        LinkedListStack<Integer> listStack = new LinkedListStack<>();
        for (int i = 0; i < 7; i++) {
            listStack.push(i);
            System.out.println(listStack);
        }

        for (int i = 0; i < 3; i++) {
            listStack.pop();
            System.out.println(listStack);
        }
    }
}
