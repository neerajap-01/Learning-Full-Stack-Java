package org.example.BoundTypeMethods;

public class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }
}
