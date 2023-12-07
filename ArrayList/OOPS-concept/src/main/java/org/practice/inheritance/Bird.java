package org.practice.inheritance;

public class Bird extends Animal{
    private String body;
    private String ability;

    public Bird() {
        height = 3f;
        weight = 20f;
        animal_type = "Birds";
        blood_type = "Warm";
        this.body = "Animals with feathers";
        this.ability = "Can fly";
    }

    @Override
    public String showInfo() {
        return "Bird{" +
                "body='" + body + '\'' +
                ", ability='" + ability + '\'' +
                "} " + super.showInfo();
    }
}
