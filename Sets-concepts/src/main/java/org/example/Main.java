package org.example;

import org.example.CustomSortingInterface.Data;
import org.example.Maps.HashCode;
import org.example.Maps.HashMapDemo;
import org.example.Maps.Name;
import org.example.Maps.TreeMapDemo;
import org.example.TypesOfSets.HashSetDemo;
import org.example.TypesOfSets.LinkedSetDemo;
import org.example.TypesOfSets.TreeSetDemo;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {

        //! Sets

        /*
        * The sets are a unique type of data structure mostly used because it does not allow the
        * repetition of the elements. The basic operations of sets are shown here.
        *
        * HashSet does not contain the duplicate elements and it does not maintain any insertion order
        * which means if we iterate into the set, it can return elements in any order.
        *
        * Set does not return any individual value but, the availability of elements in a set can
        * be verified using contains() method.
        *
        * contains() method return true, if the element is available in a set and it returns false if
        * an element is unavailable in a set.
        * */
        Set<String> set = new HashSet<>();

        set.add("Someone 1");
        set.add("Someone 2");
        set.add("Someone 3");
        set.add("Someone 4");
        set.add("Someone 1");

//        for (String temp: set) {
//            System.out.println(temp);
//        }

        //! Types of Sets

        //* For more information see the Image

        //?HashSet
        HashSetDemo hashSetDemo = new HashSetDemo();
        //* Prints in random order
//        for (String x: hashSetDemo.getHashSet()) {
//            System.out.println(x);
//        }

        LinkedSetDemo linkedSetDemo = new LinkedSetDemo();
        //* Prints in order in which the data has been inserted
//        for (String x: linkedSetDemo.getLinkedHashSet()){
//            System.out.println(x);
//        }

        TreeSetDemo treeSetDemo = new TreeSetDemo();
        //* Prints in order by character ex:- A0, A1, A10, A11..., A9
//        for (String x: treeSetDemo.getTreeSet()) {
//            System.out.println(x);
//        }

        //? Custom sorting Comparator
        Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {
            @Override
            public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
                if(obj1.getKey() < obj2.getKey()) {
                    return -1;
                } else if (obj1.getKey() > obj2.getKey()) {
                    return 1;
                }
                return 0;
            }
        };

        Set<Data<Integer, String>> set1 = new TreeSet<>(COMPARE_KEY);
        set1.add(new Data<>(1,"SomeOne 1"));
        set1.add(new Data<>(2,"SomeOne 2"));
        set1.add(new Data<>(3,"SomeOne 3"));
        set1.add(new Data<>(4,"SomeOne 4"));
        set1.add(new Data<>(5,"SomeOne 2"));
        set1.add(new Data<>(1,"SomeOne 1"));
        set1.add(new Data<>(2,"SomeOne 1"));

//        for (Data data:set1) {
//            System.out.println(data);
//        }

        //! Queue
        /*
        * The queue is a data structure that First in First Out(FIFO) structure. This is based
        * on the real-life concept of the queue or a line of people. Therefore, this can be very
        * useful in several ways, such as to find the level order traversal in a tree, etc.
        * Therefore, the basic operation of this is shown here.
        *
        * In the following example, we will create the LinkedBlockingQueue. LinkedBlockingQueue is
        * of dynamic size. It’s not required to provide size while creating LinkedBlockingQueue.
        *
        * add() method is used to add data at the end of the queue, and we can iterate queue elements
        * using enhanced for loop.
        * */

        Queue<Integer> queue = new LinkedBlockingQueue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.offer(5); //Will not throw an exception and returns true:- able to add
//        queue.add(6); //Will throw an exception:- not able to add
        queue.offer(7); //Will not throw an exception and returns false:- not able to add
        queue.remove(); //Will remove the first element and returns removed element or throws an exception if empty
        queue.poll(); //Will not throw an exception and returns removed element or null if empty

//        System.out.println(queue.peek()); //Will return the first element or null if empty

//        queue.add(null); //Will throw a NullPointerException
//        System.out.println(queue);

        //! Deque
        /*
        * The queue is a data structure that First in First Out(FIFO) structure. This is based on the real-life concept of
        * the queue or a line of people. Therefore, this can be very useful in several ways, such as to find the level order
        * traversal in a tree, etc. Therefore, the basic operation of this is shown here.
        *
        * In the following example, we will create the LinkedBlockingQueue. LinkedBlockingQueue is of dynamic size. It’s
        * not required to provide size while creating LinkedBlockingQueue.
        *
        * add() method is used to add data at the end of the queue, and we can iterate queue elements using enhanced for loop.
        * */

        Deque<Integer> dequeue = new LinkedBlockingDeque<>(5);
        dequeue.add(5);
        dequeue.addFirst(4); //Will not throw an exception and adds the element at the first position
        dequeue.addLast(6); //Will not throw an exception and adds the element at the last position or throws an exception if full
        dequeue.offerFirst(3); //Will not throw an exception and adds the element at the first position
        dequeue.offerLast(7); //Will not throw an exception and adds the element at the last position or returns false if full
        dequeue.removeFirst(); //Will remove the first element and returns removed element or throws an exception if empty
        dequeue.removeLast(); //Will remove the first element and returns removed element or throws an exception if empty
        dequeue.pollFirst(); //Will remove the first element and returns removed element or null if empty
        dequeue.pollLast(); //Will remove the first element and returns removed element or null if empty
        dequeue.add(4); //Will not throw an exception and adds the element at the last position or throws an exception if full
//        System.out.println(dequeue.peekLast()); //Will return the first element or null if empty
//        System.out.println(dequeue.peekFirst()); //Will return the first element or null if empty
//        System.out.println(dequeue.peek()); //Will return the first element or null if empty

//        System.out.println(dequeue);

        //! Map

        /*
        *The maps are an interface. A map contains values based on the key, for example, key and value pair. Each pair of key and value is known as an entry. Both the key and values are objects. A map cannot contain duplicate keys, it must be unique, but
        * the value can be duplicated.
        *
        * In the following program, we use interface type(Map), generics and diamond operator to declare a new map.
        *
        * Map<Integer,String> student = new HashMap<>();
        *
        * Object put(Object k, Object v) method associates the specified value V with the specified key.
        * */

        //? HashMap
        /*
        * In hasp map, we can store the data in the form of key-value pairs. The key and value can be of any data type.
        * The key cannot be duplicated and it can be null but, the value can be duplicated and it can be null.
        *
        * The order of the elements in the hash map is not guaranteed. The hash map is not synchronized.
        * The basic operations of the hash map are shown here.
        *
        * */

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A1", "Someone 1");
        hashMap.put("A2", "Someone 2");
        hashMap.put("A3", "Someone 3");
        hashMap.put("A4", "Someone 4");
        hashMap.put("A5", "Someone 5");
        hashMap.put("A0", "Someone 0");

//        System.out.println(hashMap);

        //* Let use a custom Type instead of any data type Wrapper class
        Map<HashMapDemo, String> newHashMap = new HashMap<>();
        newHashMap.put(new HashMapDemo("Someone 1", "1"), "Someone 1");
        newHashMap.put(new HashMapDemo("Someone 1", "1"), "Someone 2");
        newHashMap.put(new HashMapDemo("Someone 3", "3"), "Someone 3");

//        System.out.println(newHashMap); //Output:- {HashMap{name='Someone 1', age='1'}=Someone 2, HashMap{name='Someone 3', age='3'}=Someone 3}

        //? Iterating through the map
//        for (String key :hashMap.keySet()) {
//            System.out.println("Key: " + key + " Value: " + hashMap.get(key));
//        }

//        for (Map.Entry<String, String> entry: hashMap.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
//        }

//        Iterator<Map.Entry<String, String>> entryIterator = hashMap.entrySet().iterator();
//        while (entryIterator.hasNext()) {
//            Map.Entry<String, String> temp = entryIterator.next();
//            System.out.println("Key: " + temp.getKey() + " Value: " + temp.getValue());
//        }

        //? TreeMap
        /*
        * In the tree map, we can store the data in the form of key-value pairs. The key and value can be of any data type.
        * The key cannot be duplicated and it can be null but, the value can be duplicated and it can be null.
        *
        * The order of the elements in the tree map is sorted by the key. The tree map is not synchronized.
        * The basic operations of the tree map are shown here.
         */

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("A1", "Someone 1");
        treeMap.put("A2", "Someone 2");
        treeMap.put("A3", "Someone 3");
        treeMap.put("A4", "Someone 4");
        treeMap.put("A5", "Someone 5");

//        System.out.println(treeMap);

        //* Let use a custom Type instead of any data type Wrapper class
        Map<TreeMapDemo, String> newTreeMap = new TreeMap<>(); //? Need to add the Comparable interface to the TreeMapDemo class
        newTreeMap.put(new TreeMapDemo("Someone 1", "1"), "Someone 1");
        newTreeMap.put(new TreeMapDemo("Someone 1", "1"), "Someone 2");
        newTreeMap.put(new TreeMapDemo("Someone 3", "3"), "Someone 3");

//        System.out.println(newTreeMap); //Output:- {HashMap{name='Someone 1', age='1'}=Someone 2, HashMap{name='Someone 3', age='3'}=Someone 3}

        //! Equals and HashCode
        /*
        *In this tutorial, we will learn “Equals and hashcode methods”. The equals method is used to compare two objects whether they have the same characteristics. This is done by comparing two hashcodes of the object which is also explained in this tutorial. The hashcode is like an id, each element has a unique id based on their declarations hence two same datatypes having the same content have the same hashcode. This way the equals to methods word.
        *
        * In the following program, check out the result when “= =” (equal to equal to) and equals method is used to compare string data.
        *
        * “= =” (equal to equal to) method returns a boolean value after completing the operation.
         */

        String str1 = "Hello";
        str1 += "World";
        String str2 = "HelloWorld";

//        System.out.println(str1.hashCode()); //Output:- 439329280
//        System.out.println(str2.hashCode()); //Output:- 439329280
//
//        System.out.println(str1 == str2); //Output:- false
//        System.out.println(str1.equals(str2)); //Output:- true

        HashCode hashCode1 = new HashCode("Hello", "World");
        HashCode hashCode2 = new HashCode("Hello", "World");

//        System.out.println(hashCode1.hashCode()); //Output:- 980546781 before overriding hashCode() method in HashCode class
//        System.out.println(hashCode2.hashCode()); //Output:- 2061475679 before overriding hashCode() method in HashCode class
//
//        System.out.println(hashCode1 == hashCode2); //Output:- false
//        System.out.println(hashCode1.equals(hashCode2)); //Output:- false because the hashCode() method is not overridden
//
//        System.out.println(hashCode1.hashCode()); //Output:- -2053301055 after overriding hashCode() method in HashCode class
//        System.out.println(hashCode2.hashCode()); //Output:- -2053301055 after overriding hashCode() method in HashCode class
//
//        System.out.println(hashCode1.equals(hashCode2)); //Output:- true

        //? Search Key in Map
        Map<TreeMapDemo, String> newTreeMap1 = new TreeMap<>(); //? Need to add the Comparable interface to the TreeMapDemo class
        newTreeMap1.put(new TreeMapDemo("Someone 1", "1"), "Someone 1");
        newTreeMap1.put(new TreeMapDemo("Someone 1", "1"), "Someone 2");
        newTreeMap1.put(new TreeMapDemo("Someone 3", "3"), "Someone 3");

        TreeMapDemo code = null;

        for (TreeMapDemo key: newTreeMap1.keySet()) {
            if(newTreeMap1.get(key).equals("Someone 2")){
                code = key;
                break;
            }
        }
//        System.out.println(code);

        //! Set
        /*

        *The set is a unique type of data structure mostly used because it does not allow the repetition of the elements. The basic operations of sets are shown here.
        *
        * HashSet does not contain the duplicate elements and it does not maintain any insertion order which means if we iterate into the set, it can return elements in any order.
        *
        *The tutorial shows some important techniques that can be implemented and that save time, for example. The addAll()  method for queues and sets and also implementing the binary search in the same also explore the comparable interface for lists.
        *
        * The following program demonstrates how to create a list from set items. As this list is created from the set, so duplicate items will be eliminated.
        *
        *
         */

        Set<String> set2 = new HashSet<>();
        set2.add("Someone 1");
        set2.add("Someone 2");
        set2.add("Someone 3");
        set2.add("Someone 4");
        set2.add("Someone 1");

        List<String> list = new ArrayList<>(set2);
        // OR
        List<String> list1 = new ArrayList<>();
        list1.addAll(set2);

        Collections.sort(list1);
//        System.out.println(list1); //Output:- [Someone 1, Someone 2, Someone 3, Someone 4]
//        System.out.println(Collections.binarySearch(list1, "Someone 3")); //Output:- 2
//        System.out.println(Collections.binarySearch(list1, "Someone 5")); //Output:- -5, if the element is not present in the list then it will return the negative value of the position where the element should be present

        Set<Name> set3 = new HashSet<>();
        set3.add(new Name("Someone 1"));
        set3.add(new Name("Someone 2"));
        set3.add(new Name("Someone 3"));

        List<Name> list2 = new ArrayList<>();
        list2.addAll(set3);

        Collections.sort(list2);
        System.out.println(list2); //Output:- [Name{name='Someone 1'}, Name{name='Someone 2'}, Name{name='Someone 3'}]
        System.out.println(Collections.binarySearch(list2, new Name("Someone 3"))); //Output:- 2
        System.out.println(Collections.binarySearch(list2, new Name("Someone 7"))); //Output:- -4

    }
}