package org.example.TypesOfSets;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    Set<String> hashSet = new HashSet<>();

    private void addData() {
        for (int i = 30; i >= 0; i--) {
            hashSet.add("A"+i);
        }
    }

    public Set<String> getHashSet() {
        addData();
        return hashSet;
    }
}
