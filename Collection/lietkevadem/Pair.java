package Collection.lietkevadem;

import java.io.Serializable;

public class Pair<K, V> implements Comparable<Pair<K, V>>, Serializable {
    private K key;
    private V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    @Override
    public String toString() {
        return key + " " + value;
    }
    @Override
    public int compareTo(Pair<K, V> o) {
        return (Integer)o.value - (Integer)this.value;
    } 
}
