package com.studmat.jdp.creational.abs.factory;

public class ShowFactory implements AbstractFactory<OTTShow> {
    public OTTShow load(String show){
        if ("tv".equalsIgnoreCase(show)){
            return new HotStarTv();
        }
        if ("movie".equalsIgnoreCase(show)){
            return new OTTMovie();
        }
        return null;
    }
}
