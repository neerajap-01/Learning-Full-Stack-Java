package org.example.ObjectsinFile;

import java.io.Serializable;

// Serializable is a marker interface that tells the compiler that this class can be serialized and deserialized
// Which means that this class can be converted to a byte stream and can be converted back to an object of this class
public class Vehicle implements Serializable {
    // This is the serialVersionID which is used to handle the exception which is thrown after making Variables
    // in Vehicle.java as final
    private static final long serialVersionUID = 6423144807643359315L;
    private final String name;
    private final int number;

    public Vehicle(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
