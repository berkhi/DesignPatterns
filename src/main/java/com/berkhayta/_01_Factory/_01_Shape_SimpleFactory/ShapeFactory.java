package com.berkhayta._01_Factory._01_Shape_SimpleFactory;

public class ShapeFactory {
    public static Shape getShape(ShapeType type){
       return switch (type) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
        };
    }
}
