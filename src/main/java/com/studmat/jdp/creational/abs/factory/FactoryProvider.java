package com.studmat.jdp.creational.abs.factory;

public class FactoryProvider {
    public static AbstractFactory getfactory(String type){
        if("platform".equalsIgnoreCase(type)){
            return new PlatformFactory();
        } if("show".equalsIgnoreCase(type)){
            return new ShowFactory();
        }

        return null;
    }

}

