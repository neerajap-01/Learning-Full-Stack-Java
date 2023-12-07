package org.example.Maps;

import java.util.Objects;

public class HashCode {
    private String name;
    private String age;

    public HashCode(String name, String age) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HashCode hashCode)) return false;
        return Objects.equals(name, hashCode.name) && Objects.equals(age, hashCode.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "HashCode{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
