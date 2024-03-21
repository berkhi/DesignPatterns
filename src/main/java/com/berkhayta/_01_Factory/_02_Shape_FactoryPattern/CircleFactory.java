package com.berkhayta._01_Factory._02_Shape_FactoryPattern;

public class CircleFactory extends ShapeFactory{
    @Override
    Shape createShape() {
        return new Circle();
    }
}
