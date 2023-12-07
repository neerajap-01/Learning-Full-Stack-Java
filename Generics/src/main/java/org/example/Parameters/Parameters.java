package org.example.Parameters;

public class Parameters<K, V> {
    private  K key;
    private  V value;

    public Parameters(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public <E, N> void  display(E element, N number){
        System.out.println("Element: "+element+ " Number: "+number);
    }

}
