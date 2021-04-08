package com.studmat.jdp.creational.factory;

import javax.xml.transform.Source;

/**
 * https://www.javatpoint.com/design-patterns-in-java
 */
public class ShapeFactory {
    public static void main(String[] args) {
        Shape s = new ShapeFactory().getShape("triangle4");
        s.draw();
    }

    public Shape getShape(String ShapeType){
        switch (ShapeType) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "triangle":
                return new Triangle();
            default:
                System.out.println("No match Found");
        }
        return null;
    }
}
