package com.berkhayta._01_Factory._01_Shape_SimpleFactory;

public class Runner {
    public static void main(String[] args) {
        Shape shape=ShapeFactory.getShape(ShapeType.RECTANGLE);
        shape.draw();
    }
}
