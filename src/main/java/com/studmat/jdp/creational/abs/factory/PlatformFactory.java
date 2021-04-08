package com.studmat.jdp.creational.abs.factory;

public class PlatformFactory implements AbstractFactory<Platform> {

    public Platform load(String platform){
        if ("netflix".equalsIgnoreCase(platform)){
            return new Netflix();
        }
        if ("hotstar".equalsIgnoreCase(platform)){
            return new HotStar();
        }
        return null;
    }



}
