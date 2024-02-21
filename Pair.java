public class Pair<K,V> {
    private final K key;
    private final V value;

    public Pair(K key, V Value){
        this.key = key;
        this.value = Value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }
}
