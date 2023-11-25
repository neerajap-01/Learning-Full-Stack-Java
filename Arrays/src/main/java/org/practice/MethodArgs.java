package org.practice;

public class MethodArgs {
    public void displayValue(int value){

        System.out.println("Display method : "+value);
        value = 20;
        System.out.println("Display method : "+value);

    }

    void displayNames(String[] names){
        System.out.println(names[0]);
        names[0] = "John";
    }
}
