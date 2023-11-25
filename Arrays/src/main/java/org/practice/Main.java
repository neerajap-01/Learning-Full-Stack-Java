package org.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //! Arrays
        /*
        * In array, we can’t store different types of data in the same array.
        * So if we create an array for integers, the data must be in the form of integer type only.
        *
        * One major issue with an array is that the size of an array is fixed. Once an array is declared,
        * It's size can neither be increased or decreased
        *
        * */

        //? Without Initialization
        String[] names;
        names = new String[10];
        names[0] = "Chaand";
        names[5] = "studyeasy";
//        System.out.println(names[9]); //Prints default value that is null
//        System.out.println(names[5]);


        //? With initialization
        String[] temp = {"Hello", "Something"};
//        System.out.println(temp[0]);

        //? More examples
        float[] values = {10.0f, 25.1252142f, 60};
//        System.out.println(values[1]);

//        for (String name: names) System.out.println(name); //Foreach for looping

        //! Method arguments

        //? Call by value in Java
        MethodArgs methodArgs = new MethodArgs();
        int value = 10;
//        methodArgs.displayValue(value);
//        System.out.println("Value in main, "+ value);

        //? Call by refernce in Java
        String[] names2 = {"Tom", "Chaand", "Study", "Easy", "Raj"};
//        System.out.println(names2[0]);
//        methodArgs.displayNames(names2);
//        System.out.println("New value : "+names2[0]);
    }
}