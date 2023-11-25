package org.practice.StaticElements;

public class TestStatic {
    public static int testVariable = 0;

    public static int getTestVariable() {
        return testVariable;
    }

    public static void setTestVariable(int testVariable) {
        TestStatic.testVariable = testVariable;
    }
}
