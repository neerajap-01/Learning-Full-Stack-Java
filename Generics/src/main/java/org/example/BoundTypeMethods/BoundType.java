package org.example.BoundTypeMethods;

public class BoundType<K extends Integer,V extends Name> {
    public Name getName(String name) {
        return new Name(name);
    }

    private K key;
    private V value;

    public BoundType(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    public <N extends Number,E> void display(N number, E element){
        System.out.println("Number: "+number+ " Element: "+element);
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
}


