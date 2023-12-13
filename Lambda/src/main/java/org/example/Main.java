package org.example;

import org.example.ComparatorLambdaExpression.Data;
import org.example.ForEachLambdaExp.ForEachData;
import org.example.LambdaInterface.Lambda;

import java.util.*;
import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        //! Lambda Expression
        /*
        * The lambda expression is used mainly to execute programs making the programs shorter.
        * Therefore, previously we used classes to implement functions defined in the interfaces,
        * but here we can directly write the function declarations with the help of the lambda expression.
        *
        * In the following program, we demonstrate how to create a lambda expression with a single statement.
        *
        * To create a lambda expression, we specify the input parameters (if any) on the left side of the
        * lambda operator ->, we place the expression of the declarations on the right side of the lambda
        * operator.
        * Lambda Expression is a way to represent a method implementation using an expression.
        * It is a way to implement a method of a functional interface.
        * It is a way to implement a method of an interface which has only one abstract method.
        *
        * Syntax:
        * (parameter_list) -> {body}
         */

        //? One way to create a lambda expression
        Lambda lambda = new Lambda() {
            @Override
            public void demo() {
                System.out.println("Hello World");
            }
        };
//        lambda.demo();

        //? Another way to create a lambda expression
        Lambda lambda1 = () -> System.out.println("Hello World");
//        lambda1.demo();

        Lambda lambda2 = (() -> System.out.println("Hello World"));
//        lambda2.demo();

        Lambda lambda3 = () -> {
            System.out.println("Hello World");
            System.out.println("Hello World");
        };
//        lambda3.demo();

        Lambda lambda4 = (() -> {
            System.out.println("Hello World");
            System.out.println("Hello World");
        });
//        lambda4.demo();

        //? Creating Thread using Lambda Expression
        //* Initially how we used to create a thread
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        });
//        thread.start(); //? Starting the thread; Prints `Hello World`

        //* Now we can create a thread using lambda expression

        //* Here instead of passing an object of Runnable interface we are passing a lambda expression to run method in Runnable interface
        Thread thread1 = new Thread(() -> System.out.println("Hello World 2"));
//        thread1.start(); //? Starting the thread; Prints `Hello World 2`

        //? Comparator using Lambda Expression
        List<Data> list = new ArrayList<>();
        list.add(new Data("A50000"));
        list.add(new Data("A4000"));
        list.add(new Data("A300"));
        list.add(new Data("A1"));
        list.add(new Data("A20"));

        //* Intially how we used to sort the list using comparator
        Collections.sort(list, new Comparator<Data>() {
            @Override
            public int compare(Data o1, Data o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //* Now we can sort the list using lambda expression
        Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        //* If we want to sort the list using length of the name
        Collections.sort(list, (o1, o2) -> {
            if(o1.getName().length() > o2.getName().length()) {
                return 1;
            } else if (o1.getName().length() < o2.getName().length()) {
                return -1;
            } else {
                return 0;
            }
        });

        //? ForEach Loop using Lambda Expression


        List<ForEachData> list1 = Arrays.asList(
                new ForEachData("A50000"),
                new ForEachData("A4000"),
                new ForEachData("A300"),
                new ForEachData("A1"),
                new ForEachData("A20")
        );
        //* Initially how we used to iterate over the list
//        for (ForEachData data : list1) {
//            System.out.println(data.getName());
//        }

        //* Now we can iterate over the list using lambda expression
//        list1.forEach(data -> System.out.println(data.getName()));

        //! Predicate
        /*
        * Predicate is a functional interface that can be used anywhere we need to evaluate a boolean condition.
        * It takes one argument and returns a boolean value.
        * It has a single method called test() which returns a boolean value.
        * It is used to filter data from a Java collection.
        * It is used with the Stream API.
        * It is used to filter data based on a condition.
        *
        * Syntax:
        * Predicate<T> predicate = t -> t > 5;
        * boolean result = predicate.test(10);
        * System.out.println(result); // true
        *
        * For example, we can use a predicate to filter a list of integers that are greater than 5.
         */

        //? Initially how we used to filter the list
        IntPredicate lessThan5 = new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value < 5;
            }
        };
//        System.out.println(lessThan5.test(10)); // false

        //* Now we can filter the list using lambda expression`
        IntPredicate lessThan18 = values -> values < 18;
        IntPredicate moreThan18 = values -> values > 18;
//        System.out.println((lessThan18).or(moreThan18).test(10)); // true
//        System.out.println((lessThan18).and(moreThan18).negate().test(10)); // false

    }
}