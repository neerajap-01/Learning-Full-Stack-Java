package org.practice.AccessModifiers;

public class Other {
    int a = 10; //* This can be access in same package for example in TestMain.java file is can be accessed as they are in same package
    protected int b = 100; //* Same for this as well accessible via same package
    private int c = 100; //Cannot access outside the class
    public int d = 1000; //Can access anywhere through Other class

    public void printPrivateVariable() {
        System.out.println("Prints using private access modifies in Other class, "+ c);
    }
}
