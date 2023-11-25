package org.practice.InnerClasses;

public class Lock {
    String code = "123456";

    public String getCode() {
        return code;
    }

    abstract public class newLock {
        public abstract void isUnlocked(String key);

    }
}