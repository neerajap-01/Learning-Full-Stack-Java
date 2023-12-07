package org.practice.inheritance;

public class Ele extends Fish {
    private String ability;
    public Ele() {
        super();
        this.ability = "Releases electric shock";
    }

    @Override
    public String showInfo() {
        return "Ele{" +
                "ability='" + ability + '\'' +
                "} " + super.showInfo();
    }
}
