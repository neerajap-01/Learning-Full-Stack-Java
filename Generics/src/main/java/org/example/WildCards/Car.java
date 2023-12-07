package org.example.WildCards;

public class Car extends Vehicle {
    private String model;

    public Car(int id, String model) {
        super(id);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                "} " + super.toString();
    }
}
