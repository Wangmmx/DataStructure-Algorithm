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

        public Node(K key, V value) {
            this(key, value, null);
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

    public Node getNode(K key) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (key.equals(cur.key)) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean contains(K key) {
     return getNode(key) != null;
    }

    @Override
    public void add(K key, V value) {
        if (getNode(key) != null) throw new IllegalArgumentException("Failed, key is exist");
        dummyHead.next = new Node(key, value, dummyHead.next);
        size++;
    }

    @Override
    public V remove(K key) {
        if (isEmpty()) return null;
        if (!contains(key)) return null;
        Node prev = dummyHead;
        while (prev.next != null) {
            Node del = prev.next;
            if (del.key.equals(key)) {
                prev.next = del.next;
                del.next = null;
                size--;
                return del.value;
            }
            prev = prev.next;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V get(K key) {
        if (getNode(key) == null) return null;
        return getNode(key).value;
    }

    @Override
    public void set(K key, V value) {
        if (getNode(key) == null) throw new IllegalArgumentException("Failed, key not exist");
        Node node = getNode(key);
        node.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Map [");
        for (Node cur = dummyHead.next; cur != null; cur = cur.next) {
            sb.append(cur.key+":" +cur.value + "  ");
        }
        sb.append("]");
        return sb.toString();
    }
}
