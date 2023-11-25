package org.practice.FinalKeyword;

public class Child extends Parent {
    private final int x; //If we had given a value to here then constructor won't be need as the final keyword won't allow to change the value of x

    public int getX() {
        return x;
    }

    public Child() {
        this.x = 10;
    }

    public Child(int x) {
        this.x = x;
    }

    @Override
    public void USA() {
        System.out.println("USA is a nice country with guns!!!");
    }
}
