package org.practice;

import java.util.Objects;

public class Car {
    private String door; //default value of an instance of String is `null`
    private String engine;
    private int car_speed; //default value of an instance of Integer is `0`
    private float test; //default value of an instance of Float is `0.0`
    private boolean test2; //default value of an instance of Boolean is `false`

    //!Default constructor
    public Car() {
        door = "closed";
        engine = "off";
        car_speed = 0;
    }

    public Car(String door, String engine, int car_speed) {
        this.door = door;
        this.engine = engine;
        this.car_speed = car_speed;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public int getCar_speed() {
        return car_speed;
    }

    public void setCar_speed(int car_speed) {
        this.car_speed = car_speed;
    }

    //Below are the Getters and Setters of the above variables
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        //System.out.println(this); //Prints org.practice.Car@28a418fc
        this.engine = engine;
    }

    public String run() {
        if(door.equals("closed") && engine.equals("on") && car_speed > 0) {
            return "Car is running";
        } else {
            return "Car is in idle position";
        }
    }

}
