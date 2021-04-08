package com.studmat.jdp.creational.abs.factory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory<Platform> af = FactoryProvider.getfactory("platform");
        Platform p = af.load("netflix");

    }

}
