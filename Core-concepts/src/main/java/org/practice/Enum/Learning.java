package org.practice.Enum;

public enum Learning {
    COREJAVA("10"), COLLECTIONS("Neeraj"), GENERICS("10"), JSP("10"), MULTITHREADING("true");

    private String name;

    Learning(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
