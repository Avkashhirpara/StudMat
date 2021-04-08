package com.studmat.jdp.creational.abs.factory;

public class OTTMovie implements OTTShow {
    @Override
    public void play() {
        System.out.println("Movie played");
    }

    @Override
    public void volumnUp() {
        System.out.println("Movie volumn up ");
    }

    @Override
    public void volumndown() {
        System.out.println("Movie volumn down");

    }

    @Override
    public void stop() {
        System.out.println("Movie stopped");
    }
}
