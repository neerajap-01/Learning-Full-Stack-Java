package org.practice.Interface;

public class Samsung implements Phone, Andriod {
    @Override
    public String processor() {
        return "SD888";
    }

    @Override
    public int spaceInGB() {
        return 256;
    }

    @Override
    public String whatsapp() {
        return "Chat messages for free";
    }
}
