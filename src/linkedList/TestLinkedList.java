package linkedList;

public class TestLinkedList {

    public static void main(String[] args) {
  LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
        }
        System.out.println(linkedList);

        System.out.println(linkedList.contains(7));

        linkedList.set(1,100);
        System.out.println(linkedList);

        linkedList.add(1,99);
        System.out.println(linkedList);

        linkedList.remove(3);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
