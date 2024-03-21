package com.berkhayta._01_Factory._02_Shape_FactoryPattern;

public class RunnerShape {
    public static void main(String[] args) {
        ShapeFactory circleFactory=new CircleFactory();
        Shape shape1 = circleFactory.createShape(); //circle implements Shape
        shape1.draw();

        ShapeFactory rectangleFactory=new RectangleFactory();
        Shape shape2 = rectangleFactory.createShape();
        shape2.draw();
    }
}
