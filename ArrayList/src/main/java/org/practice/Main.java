package org.practice;

import org.practice.AutoBoxingAutoUnboxing.IntWrapper;
import org.practice.Comparing.Names;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //! ArrayList
        /*
        * Here all the basic operations associated with the Arraylists are shown such as append
        * the name to the ArrayList, remove by position, remove by the string ( case sensitive ) and
        * also get the position of the element given.
        * */

        ArrayList<String> listNames = new ArrayList<>();
        listNames.add("Someone");
        listNames.add("Someone1");
        listNames.add("Someone2");
        listNames.add("Someone3");
        listNames.add("Someone4");
        listNames.add("Someone5");
//        System.out.println(listNames.get(5)); //Prints `Someone5`
        listNames.remove(0); // Returns true/false
//        System.out.println(listNames); // Prints `[Someone1, Someone2, Someone3, Someone4, Someone5]`
        //? New Array is `[Someone1, Someone2, Someone3, Someone4, Someone5]`
//        System.out.println(listNames.set(0, "Someone6")); //Returns the replaced value i.e `Someone1`

        //! Autoboxing and Unboxing
        /*
        * ArrayList only accepts the elements that are objects of a class such as an Integer class or
        * any class defined by the user, but not for any primitive data type. Therefore, if we define
        * the class as an Integer and not as a class defined by the user, then java automatically
        * simplifies the work to create necessary new objects and the same while getting the value
        * through indexing which we have to manually define while using a user-created class both of
        * which examples are shown.
        *
        * In the following example, ArrayList accepts the elements which are an object to a class such
        * as an Integer class but not for any primitive data type.
        *
        * We define the class as an Integer and it is autoboxed through method invocation. This is known
        * as Autoboxing because in the following code conversion is taking place automatically.
        * */

        ArrayList<Integer> studentNumbers = new ArrayList<>(); //* Here the Integer is a class and not a `int` primitive datatype
        studentNumbers.add(25); //Autoboxing - Data is getting stored automatically
//        System.out.println(studentNumbers.get(0)); // unboxing is happening automatically

        ArrayList<IntWrapper> studentNumbers1 = new ArrayList<>(); //Here we are using custom Wrapper
        studentNumbers1.add(new IntWrapper(12)); // boxing is done manually
//        System.out.println(studentNumbers1.get(0).getNum());// unboxing is done by itself

        ArrayList<Double> numberList = new ArrayList<>();
        numberList.add(Double.valueOf(25.4)); //This is how behind the scene java is working to store value when we `numberList.add(25.4)` type
//        System.out.println(numberList); //Prints `[25.4]`
//        System.out.println(numberList.get(0).doubleValue()); //This is how behind the scene java is working to store value when we `numberList.get(0)`

        //! Stack
        /*
        * The useful stack methods that are a push(), pop(), and search() along with empty() methods
        * are shown here. These methods are used to perform basic operations. In this tutorial, users
        * will learn how to define a stack along with the use of all the above-stated methods.
        *
         !The index of stack starts from 1 and not 0
        * */

        Stack<Integer> demo = new Stack<>();
        demo.push(0);
        demo.push(1);
        demo.push(2);
        demo.push(3);
        demo.push(4);
        demo.push(5);

//        for(Integer temp:demo) {
//            System.out.println(temp);
//        }

//        System.out.println(demo.search(3)); //!Prints `3`, It is element position and not the index
//        System.out.println(demo.pop()); //Prints `5`

//        if(demo.isEmpty()){
//            System.out.println("Stack is empty");
//        }else{
//            System.out.println("Stack is not empty");
//        }

//        System.out.println(demo.search(56)); //Prints `-1`
//        System.out.println(demo.size()); //Prints `5`
//        System.out.println(demo); //Prints `[0, 1, 2, 3, 4, 5]`
        int x = demo.indexOf(4);
//        System.out.println(x); //Prints `4`
//        System.out.println(demo.get(4)); //Prints `4`

        //! LinkedList
        /*
        * A LinkedList is considered as a data structure similar to any other data structure like
        * arrays, stacks, and queues. Here, every node is interconnected to the next node through a
        * memory address link.
        *
        * A LinkedList has three elements namely:
        *
        *   1. Head
        *   2. Nodes
        *   3. Tails
        * */

        LinkedList<String> countries = new LinkedList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Poland");
        countries.add("Egypt");
        countries.add("Thailand");
        countries.add("Russia");

//        System.out.println(countries); //Prints `[India, USA, Poland, Egypt, Thailand, Russia]`
        countries.add(2, "Nepal");
//        System.out.println(countries); //Prints `[India, USA, Nepal, Poland, Egypt, Thailand, Russia]`
//        System.out.println(countries.set(3, "Singapore")); //Returns `Poland`
//        System.out.println(countries); //Prints `[India, USA, Nepal, Singapore, Egypt, Thailand, Russia]`

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Mumbai");
        cities.add("Bangaluru");
        cities.add("Chennai");
        cities.add("Hyderabad");
//        new Main().printList(cities); //Prints values in cities
//        new Main().printList(countries); //Prints values in countries

        //? Using Iterator class/object
//        new Main().printListIterator(countries);

        cities.sort(null);
//        System.out.println(cities); //Prints `[Bangaluru, Chennai, Hyderabad, Mumbai]`
        Collections.reverse(cities);
//        System.out.println(cities); //Prints `[Mumbai, Hyderabad, Chennai, Bangaluru]`

        //? Compareto Method
        /*
        * For example:- `numbers.get(1).compareTo(1)`
        *       PART-1 = numbers.get(1);
        *       PART-2 = compareTo(1);
        *
        * If PART-1 and PART-2 is same it returns `0`
        * If PART-1 is greater than PART-2 it returns `1` can give positive numbers as well
        * If PART-1 is smaller than PART-2 it returns `-1` can give other negative numbers as well
        *
         * */
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);

//        System.out.println(numbers.get(0).compareTo(1)); //Prints `-1`;  0 is compared to 1
//        System.out.println(numbers.get(1).compareTo(1)); //Prints `0`;   1 is compared to 1
//        System.out.println(numbers.get(2).compareTo(1)); //Prints `1`;   2 is compared to 1

        String temp1 = "a";
        String temp2 = "z";

//        System.out.println(temp1.compareTo(temp2)); //Prints `-25`

        List names = new LinkedList();
        names.add(new Names("Neeraj"));
        names.add(new Names("Shiwani"));
        names.add(new Names("Neel"));
        names.add(new Names("Hrithik"));

//        System.out.println(names); //Prints `[Neeraj, Shiwani, Neel, Hrithik]`
        names.sort(null); //Throws an `java.lang.ClassCastException` exception to make this work we need to implement Comparable to the Names class
//        System.out.println(names); //Now it Prints `[Neel, Neeraj, Shiwani, Hrithik]`

        List<Object> elements = new ArrayList<>();
        elements.add("Neeraj");
        elements.add(22);
        elements.add(62.5);
        elements.add(true);

//        System.out.println(elements); //Prints `[Neeraj, 22, 62.5, true]`



    }

    void printList(List<String> list){
        for (String temp : list) {
            System.out.println(temp);
        }
    }

    void printListIterator(List<String> list) {
        Iterator<String> data = list.listIterator();

        while (data.hasNext()){
            System.out.println(data.next());
        }
    }
}