package com.studmat.jdp.creational.abs.factory;

public class NetFlixTv implements OTTShow {
    @Override
    public void play() {
        System.out.println("tv series played");
    }

    @Override
    public void volumnUp() {
        System.out.println("tv series volumn up ");
    }

    @Override
    public void volumndown() {
        System.out.println("tv series volumn down");

    }

    @Override
    public void stop() {
        System.out.println("tv series stopped");
    }
}
