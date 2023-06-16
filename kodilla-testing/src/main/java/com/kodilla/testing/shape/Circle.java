package com.kodilla.testing.shape;

import static java.lang.Math.*;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return PI * pow(radius, 2);
    }
}
