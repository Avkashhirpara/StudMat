package com.studmat.jdp.creational.abs.factory;

public class Netflix implements Platform {
    @Override
    public void play(OTTShow os) {
        System.out.println("This is netflix playing ");
        os.play();
    }
}
