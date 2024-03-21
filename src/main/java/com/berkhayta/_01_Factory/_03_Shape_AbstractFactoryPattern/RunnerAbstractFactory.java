package com.berkhayta._01_Factory._03_Shape_AbstractFactoryPattern;

public class RunnerAbstractFactory {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
    }
}
