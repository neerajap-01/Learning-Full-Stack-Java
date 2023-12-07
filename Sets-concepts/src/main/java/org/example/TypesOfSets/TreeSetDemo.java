package org.example.TypesOfSets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    Set<String> treeSet = new TreeSet<>();

    private void addData() {
        for (int i = 30; i >= 0; i--) {
            treeSet.add("A"+i);
        }
    }

    public Set<String> getTreeSet() {
        addData();
        return treeSet;
    }
}
