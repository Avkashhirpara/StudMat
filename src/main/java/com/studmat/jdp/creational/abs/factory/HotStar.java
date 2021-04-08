package com.studmat.jdp.creational.abs.factory;

public class HotStar implements Platform {
      @Override
    public void play(OTTShow os) {
        System.out.println("this is hotstar");
        os.play();
    }
}
