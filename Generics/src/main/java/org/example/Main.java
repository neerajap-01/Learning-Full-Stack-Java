package org.example;

import org.example.BoundTypeMethods.BoundType;
import org.example.BoundTypeMethods.Name;
import org.example.GenericMethods.GenericMethods;
import org.example.Generics.Data;
import org.example.Generics.GenericData;
import org.example.Parameters.Parameters;
import org.example.WildCards.Car;
import org.example.WildCards.Vehicle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //! Generics
        /*
        * Generics is a facility of generic programming that was added to Java in 2004 within version
        * J2SE 5.0. It allows a type or method to operate on objects of various types while providing
        * security of compile-time type.
        *
        * Advantages
        *
        *   - Re-usability (You can compose a class or an interface once and use them for any type)
        *   - Stronger type checking, better type safety (reduces run time error)
        *   - Eliminate type casting statements (improve the program’s performance)
        *
        * The generic allows us to define a single declaration for all the datatypes (not primitive)
        * but all the Objects such as Integers, String, etc. Therefore, there is no need to define the
        * same method for each data type, which is also a time and code redundant technique. This also
        * provides compile-time safety.
        *
        * A generic type is a class or interface that is parameterized on types. Here we use angle
        * brackets (<>) to specify the type parameter.
        * */

        GenericData<String> genericData = new GenericData<>("some data"); //? We want to initialize this object with `String` datatype

        String y = genericData.getData();
//        System.out.println(y);

        List<Data<String>> elements = new LinkedList<>();
        elements.add(new Data<>("Neeraj"));
        elements.add(new Data<>("Studing Java"));

//        for (Data<String> data:elements) {
//            System.out.println(data);
//        }

        List<Data<Object>> elements2 = new LinkedList<>();
        elements2.add(new Data<>("Neeraj"));
        elements2.add(new Data<>("Studing Java"));
        elements2.add(new Data<>(25));
        elements2.add(new Data<>(35.54));
        elements2.add(new Data<>(true));

//        for (Data<Object> data:elements2) {
//            System.out.println(data);
//        }

        //! Type of Parameters
        /*
        * T - Type
        * E- Element
        * K - Key
        * N - number
        * V - Value
        * */

        Parameters<Number, String> parametersGenerics = new Parameters<>(10, "Neeraj");
//        System.out.println("Key : "+parametersGenerics.getKey() + " Value: "+parametersGenerics.getValue());
//        parametersGenerics.display("Test", 40);

        //? Generic Methods
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);
        list1.add(16);
//        new GenericMethods().printListData(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("One");
        list2.add("Two");
        list2.add("Three");
//        System.out.println("**************");
//        new GenericMethods().printListData(list2);
//        System.out.println("**************");

        String[] stringArray = {"One","Two","Three", "four"};
//        new GenericMethods().printArrayData(stringArray);
//        System.out.println("**************");
        Integer[] intArray = {1,2,3,4};
//        new GenericMethods().printArrayData(intArray);

        //? BoundType Generics methods
        BoundType<Integer, Name> boundType = new BoundType<>(22, new Name("Neeraj"));
//        System.out.println("boundType, "+ boundType);

        //? Wildcards in Generics
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(1));
        list.add(new Vehicle(2));
        list.add(new Vehicle(3));
        list.add(new Vehicle(4));
        list.add(new Car(5, "GTR"));
        Main.display(list);

    }

    /*
    * ? - Used when we don't know what type of data is present in the object;
    * ? extends Vehicle - It is called as OUTER BOUND, which means that the data receive by the display
    *                     method's parameter is should have only Vehicle type.
    * ? super Vehicle - It is called as INNER BOUND, which means any class either Vehicle or Parent of
    *                   Vehicle so for that reason every class is a CHILD of OBJECT Class that's why when
    *                   we are using super the below forEach is defined using OBJECT Class
    * */
    public static void display(List<?> list) {
        for (Object obj: list) {
//            System.out.println(obj);
        }
    }

}