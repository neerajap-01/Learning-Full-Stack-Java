package org.example.TypesOfSets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetDemo {

    Set<String> linkedHashSet = new LinkedHashSet<>();

    private void addData() {
        for (int i = 30; i >= 0; i--) {
            linkedHashSet.add("A"+i);
        }
    }

    public Set<String> getLinkedHashSet() {
        addData();
        return linkedHashSet;
    }
}
