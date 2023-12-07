package org.example.CustomSortingInterface;

public class Data<K extends Integer, V extends String> {
    private K key;
    private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
