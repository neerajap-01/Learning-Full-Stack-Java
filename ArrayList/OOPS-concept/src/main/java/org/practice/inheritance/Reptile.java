package org.practice.inheritance;

public class Reptile extends Animal {
    protected String skin;
    protected String body;
    protected String offSpring;

    public Reptile() {
        height = 10f;
        weight = 70f;
        animal_type = "Reptile";
        blood_type = "Cold";
        this.skin = "Dry skin";
        this.body = "Backbone";
        this.offSpring = "Soft Shelled Eggs";
    }

    @Override
    public String showInfo() {
        return "Reptile{" +
                "skin='" + skin + '\'' +
                ", body='" + body + '\'' +
                ", offSpring='" + offSpring + '\'' +
                "} " + super.showInfo();
    }
}
