package linkedList;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        System.out.println(linkedList1);


        LinkedList<Integer> linkedList2 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList2.addFirst(i);
        }
        System.out.println(linkedList2);

        System.out.println(linkedList2.contains(7));

        linkedList2.set(1,100);
        System.out.println(linkedList2);

        linkedList2.add(1,99);
        System.out.println(linkedList2);
    }
}
