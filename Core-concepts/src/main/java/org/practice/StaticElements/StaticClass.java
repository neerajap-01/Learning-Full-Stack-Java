package org.practice.StaticElements;

public class StaticClass { //We cannot have this class a static class or else it'll throw an Runtime error of java
    public static class InnerClass {
        public static int x = 10;
        public static void staticMessage() {
            System.out.println("Hello static message");
        }
    }

    public class NonStaticInnerClass {
        public void nonStaticMessage() {
            System.out.println("Hello non static message");
        }
    }

}
