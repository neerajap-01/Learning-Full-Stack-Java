package org.practice.inheritance;

public class Crocodile extends Reptile{
    public Crocodile() {
        super();
        offSpring = "Hard Shelled eggs";
    }

    public String showInfo() {
        return "Crocodile{" +
                "offSpring='" + offSpring + '\'' +
                "} " + super.showInfo();
    }
}
