package org.example.Maps;

public class TreeMapDemo implements Comparable<TreeMapDemo> {
    private String name;
    private String age;

    public TreeMapDemo(String name, String age) {
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
        return "TreeMap{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public int compareTo(TreeMapDemo o) {
        String str1 = name.concat(age);
        String str2 = o.getName().concat(o.getAge());
        return str1.compareTo(str2);
    }
}
