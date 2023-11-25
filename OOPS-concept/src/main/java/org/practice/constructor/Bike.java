package org.practice.constructor;

public class Bike extends Vehicle {
    private String handle;

    public Bike() {
        handle = "short";
    }

    public Bike(String engine, int wheels, int seats, int fuelTank, String lights, String handle) {
        super(engine, wheels, seats, fuelTank, lights); //This will pass the necessary values to parent class
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String run(){
        return "Running bike";
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' +
                "} " + super.toString(); //This will help to print Parents class paramters as well using Bike class
    }
}
