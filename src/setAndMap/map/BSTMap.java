package setAndMap.map;

public class BSTMap<K extends Comparable<K>, V> implements Map<K, V> {

    private class Node {
        K key;
        V value;
        Node left;
        Node right;

        public Node(K key, V value, Node left, Node right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Node() {
            this(null,null, null, null);
        }

        public Node(K key, V value) {
            this(key, value, null, null);
        }
    }

    public Node root;
    public int size;

    public BSTMap() {
        this.root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public Node getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private Node getNode(K key, Node node) {
        if (node == null) return null;
        if (key.compareTo(node.key) == 0) return node;
        if (key.compareTo(node.key) < 0) return getNode(key, node.left);
        else return getNode(key, node.right);
    }

    private Node add(K key, V value,  Node node) {
        if (node == null) {
            size++;
            return new Node(key, value);
        }
        if (key.compareTo(node.key) < 0) {
            node.left = add(key, value, node.left);
        } else if (key.compareTo(node.key) > 0) {
            node.right = add(key, value, node.right);
        } else node.value = value;
        return node;
    }

    @Override
    public boolean contains(K key) {
        return getNode(key, root) != null;
    }


    @Override
    public V get(K key) {
        Node node = getNode(key, root);
        return node == null? null: node.value;
    }

    @Override
    public void set(K key, V value) {
        Node node = getNode(key, root);
        if (node == null) throw new IllegalArgumentException("Failed, key is not exist");
        node.value = value;
    }


    @Override
    public void add(K key, V value) {
       root = add(key, value, root);
    }

    @Override
    public V remove(K key) {
        Node node = getNode(key, root);
        if (node == null) return null;
        else {
            root = remove(root, key);
            return node.value;
        }
    }

    private Node min(Node node) {
        if (node.left == null) return node;
        return min(node.left);
    }

    private Node removeMin(Node node) {
        if (node.left == null) {
            Node right = node.right;
            node.right = null;
            size--;
            return right;
        }
        node.left = removeMin(node.left);
        return node;
    }

    private Node remove(Node node, K key) {
        if (node == null) return null;
        if (key.compareTo(node.key) < 0) {
            return remove(node.left, key);
        }
        if (key.compareTo(node.key) > 0) {
            return remove(node.right, key);
        }
        else if (key.compareTo(node.key) == 0) {
            if (node.left == null) {
                Node nodeRight = node.right;
                node.right = null;
                size --;
                return nodeRight;
            }
            if (node.right == null) {
                Node nodeLeft = node.left;
                node.left = null;
                size --;
                return nodeLeft;
            } else {
                Node successor = min(node.right);
                successor.right = removeMin(node.right);
                successor.left = node.left;
                return successor;
            }
        }
        return node;
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.key + ":" + node.value);
            inOrder(node.right);
        }
    }


    public void inOrder() {
        inOrder(root);
    }



    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBSTString(root, res);
        return res.toString();
    }

    private void generateBSTString(Node node, StringBuilder sb) {
        if (node == null) {
            sb.append("Null  ");
            return;
        }
        sb.append(node.key + ":" + node.value +"  ");
        generateBSTString(node.left, sb);
        generateBSTString(node.right, sb);
    }

}
