package org.practice.Interface;

public class Iphone implements Phone, IOS {
    @Override
    public String processor() {
        return "A15";
    }

    @Override
    public int spaceInGB() {
        return 256;
    }

    @Override
    public String airdrop() {
        return "Copy paste anywhere";
    }
}
