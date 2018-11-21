package setAndMap.map;

public interface Map<K,V> {
    int getSize();
    boolean contains(K key);
    void add(K key,V value);
    V remove(K key);
    boolean isEmpty();
    V get(K key);
    void set(K key, V value);
}
