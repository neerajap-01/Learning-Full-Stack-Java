package org.practice.inheritance;

public class Fish extends Animal {
    private String place;

    private String body;

    public Fish() {
        height = 5f;
        weight = 40f;
        animal_type = "Fish";
        blood_type = "Cold";
        this.place = "Lives in water";
        this.body = "has Gills";
    }

    @Override
    public String showInfo() {
        return "Fish{" +
                "place='" + place + '\'' +
                ", body='" + body + '\'' +
                "} " + super.showInfo();
    }
}
