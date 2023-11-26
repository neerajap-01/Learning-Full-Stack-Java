package org.practice.Comparing;

public class Names implements Comparable<Names> {
    private String name;

    public Names(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Names obj) {
        if(name.length() == obj.name.length()) return 0;
        else if (name.length() > obj.name.length()) return 1;
        else return -1;

        //? Another way is
//        return Integer.compare(name.length(), obj.name.length());
    }
}
