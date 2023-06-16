package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    void addFigure(Shape shape) {
        if (shape != null) {
            shapes.add(shape);
        }
    }

    boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    Shape getFigure(int index) {
        if (index >= shapes.size()) {
            return null;
        }
        return shapes.get(index);
    }

    String showFigures() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < shapes.size(); i++) {
            stringBuilder.append(shapes.get(i).getShapeName());
            if (i < shapes.size() - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    int checkSize() {
        return shapes.size();
    }

}
