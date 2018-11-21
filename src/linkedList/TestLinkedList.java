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

        linkedList.removeElement(100);
        System.out.println("after remove e\n"+linkedList);

        /**
         * list2
         */
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        for (int i = 50; i < 55; i++) {
            linkedList2.addFirst(i);
        }
        System.out.println(linkedList2);
        System.out.println(linkedList2.getSize());
        linkedList2.removeElement(54);
        System.out.println("after remove e\n"+linkedList2);
        System.out.println(linkedList2.getSize());
    }
}
