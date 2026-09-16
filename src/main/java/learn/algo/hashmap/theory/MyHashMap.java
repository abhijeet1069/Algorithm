package learn.algo.hashmap.theory;

import java.util.Objects;

public class MyHashMap<K,V> {
    private static class Node<K,V>{
        K key;
        V value;
        Node<K,V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private Node<K,V> [] buckets;
    private int size;

    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    public MyHashMap() {
        buckets = new Node[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(K key, V value){
        int index = getBucketIndex(key);
        Node<K,V> current = buckets[index];

        //key already exists
        while(current != null){
            if(Objects.equals(current.key,key)){
                current.value = value;
                return;
            }
            current = current.next;
        }
        //add new node at the beginning of the chain
        Node<K,V> newNode = new Node<>(key,value,buckets[index]);
        buckets[index] = newNode;
        size++;

        if(size > buckets.length*LOAD_FACTOR)
            resize();
    }

    private int getBucketIndex(K key){
        int hash = (key == null) ? 0 : key.hashCode();
        return Math.floorMod(hash,buckets.length);
    }

    private void resize(){

    }

}
