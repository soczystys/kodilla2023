package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    void addFigure(Shape shape) {

    }

    boolean removeFigure(Shape shape) {
        return false;
    }

    Shape getFigure(int n) {
        return new Circle(3);
    }

    String showFigures() {
        return null;
    }

    int checkSize() {
        return shapes.size();
    }

}
