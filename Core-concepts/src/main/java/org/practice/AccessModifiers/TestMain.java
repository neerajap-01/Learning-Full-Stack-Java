package org.practice.AccessModifiers;

public class TestMain extends Other {
    public void printsVariable() {
        Other other = new Other();
        System.out.println("Prints using default access modifies, "+ other.a);
        System.out.println("Prints using protected access modifies, "+other.b);
        other.printPrivateVariable();
        System.out.println("Prints using public access modifies from printsVariable method in TestMain class, "+other.d);
    }


}
