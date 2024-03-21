package com.berkhayta._01_Factory._01_Shape_SimpleFactory;

public class Circle implements Shape {
    public Circle() {
        draw();
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}