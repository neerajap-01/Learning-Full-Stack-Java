package org.example.Generics;

public class Data<T> {
    private T object;

    public Data(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return object.toString();
    }
}
