package setAndMap.map;


public class LinkedListMap<K,V> implements Map<K,V> {

    private class Node {
        public K key;
        public V value;
        public Node next;


        public Node() {
            this(null, null, null);
        }

        public Node(K key) {
            this(key, null, null);
        }

        public Node(K key, V value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return key.toString() + ":" + value.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedListMap() {
        dummyHead = new Node(null, null, null);
        size = 0;
    }

    private Node getNode(K key) {
        return null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean contains(K key) {
        return false;
    }

    @Override
    public void add(K key, V value) {

    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public void set(K key, V value) {

    }
}
