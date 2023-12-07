package org.practice.inheritance;

public class Eagle extends  Bird{
    @Override
    public String showInfo() {
        return "Eagle{} " + super.showInfo();
    }
}
