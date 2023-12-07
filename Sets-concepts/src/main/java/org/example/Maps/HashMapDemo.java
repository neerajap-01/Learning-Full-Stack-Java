package org.example.Maps;

public class HashMapDemo {
    private String name;
    private String age;

    public HashMapDemo(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "HashMapDemo{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
