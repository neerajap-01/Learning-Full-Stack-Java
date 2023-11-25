package org.practice.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
    class CustomException extends Exception {}
    public void doSomething() throws FileNotFoundException { //? One way to handle the exception using throws keyword
        //? Another way to handle the exception
//        try {
//            FileReader reader = new FileReader("text.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        FileReader reader = new FileReader("text.txt"); //Now whereever we might have call this function we need to handle the exception by try catch block

        System.out.println("Doing something");
    }

    public void doSomething2() throws CustomException { //One way of handling exception
        int x = 0;
        if(x == 0) {
            //Another way of handling exception
//            try {
//                throw new CustomException();
//            } catch (CustomException e) {
//                throw new RuntimeException(e);
//            }

            throw new CustomException();
        }
    }
}
