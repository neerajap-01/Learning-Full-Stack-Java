package org.example.GenericMethods;

import java.util.List;

public class GenericMethods {
    public <E> void printListData(List<E> list){
        for (E element: list) {
            System.out.println(element);
        }
    }
    public <E> void printArrayData(E[] arrayData){
        for (E element:arrayData) {
            System.out.println(element);
        }
    }
}
