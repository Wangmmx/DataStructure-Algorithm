package Stack;

public interface Stack<E> {
    int getSize();
    E pop();
    boolean isEmpty();
    E peek();
    void push(E e);
}
