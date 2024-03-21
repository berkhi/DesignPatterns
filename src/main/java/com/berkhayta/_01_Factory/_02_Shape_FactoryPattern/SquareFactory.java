package com.berkhayta._01_Factory._02_Shape_FactoryPattern;

public class SquareFactory extends ShapeFactory{
    @Override
    Shape createShape() {
        return new Square();
    }
}
