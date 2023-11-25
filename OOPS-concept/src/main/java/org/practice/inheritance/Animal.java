package org.practice.inheritance;

public class Animal {
    protected float height;
    protected float weight;
    protected String animal_type;
    protected String blood_type;

    public Animal() {
        this.height = 0;
        this.weight = 0;
        this.animal_type = "unknown";
        this.blood_type = "unknown";
    }

    public String showInfo() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", animal_type='" + animal_type + '\'' +
                ", blood_type='" + blood_type + '\'' +
                '}';
    }
}
