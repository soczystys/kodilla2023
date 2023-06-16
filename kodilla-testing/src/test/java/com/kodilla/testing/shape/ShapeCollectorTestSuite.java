package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {


    @Nested
    @DisplayName("tests for adding figure")
    class AddFigureTestSuite {
        @Test
        void addFigureTest() {
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle(4,2);

            shapeCollector.addFigure(triangle);

            Assertions.assertEquals(1, shapeCollector.checkSize());
        }

        @Test
        void addNullFigureTest() {
            ShapeCollector shapeCollector = new ShapeCollector();

            shapeCollector.addFigure(null);

            Assertions.assertEquals(0, shapeCollector.checkSize());
        }
    }

    @Nested
    @DisplayName("tests for removing figure")
    class RemoveFigureTestSuite {
        @Test
        void removeFigureTest() {
            ShapeCollector shapeCollector = new ShapeCollector();

            Shape triangle1 = new Triangle(4,2);
            Shape triangle2 = new Triangle(3,6);
            Shape triangle3 = new Triangle(4,4);

            shapeCollector.addFigure(triangle1);
            shapeCollector.addFigure(triangle2);
            shapeCollector.addFigure(triangle3);

            boolean result = shapeCollector.removeFigure(triangle2);

            Assertions.assertEquals(2, shapeCollector.checkSize());
            Assertions.assertTrue(result);
        }

        @Test
        void removeFigureNotExistingTest() {
            ShapeCollector shapeCollector = new ShapeCollector();

            Shape triangle1 = new Triangle(4,2);
            Shape triangle2 = new Triangle(3,6);
            Shape triangle3 = new Triangle(4,4);
            Shape circle = new Circle(1);

            shapeCollector.addFigure(triangle1);
            shapeCollector.addFigure(triangle2);
            shapeCollector.addFigure(triangle3);

            boolean result = shapeCollector.removeFigure(circle);

            Assertions.assertEquals(3, shapeCollector.checkSize());
            Assertions.assertFalse(result);
        }
    }


    @Nested
    @DisplayName("tests for getting figure")
    class GetFigureTestSuite {
        @Test
        void getFigureTest() {
            ShapeCollector shapeCollector = new ShapeCollector();

            Shape triangle1 = new Triangle(4,2);
            Shape triangle2 = new Triangle(3,6);
            Shape triangle3 = new Triangle(4,4);

            shapeCollector.addFigure(triangle1);
            shapeCollector.addFigure(triangle2);
            shapeCollector.addFigure(triangle3);

            Shape result = shapeCollector.getFigure(2);

            Assertions.assertEquals(triangle2, result);
        }

        @Test
        void getFigureWithIndexOutOfBounds() {
            ShapeCollector shapeCollector = new ShapeCollector();

            Shape triangle1 = new Triangle(4,2);
            Shape triangle2 = new Triangle(3,6);
            Shape triangle3 = new Triangle(4,4);

            shapeCollector.addFigure(triangle1);
            shapeCollector.addFigure(triangle2);
            shapeCollector.addFigure(triangle3);

            Shape result = shapeCollector.getFigure(4);

            Assertions.assertNull(result);
        }
    }

    @Nested
    @DisplayName("tests for getting figure")
    class ShowFiguresTestSuite {
        @Test
        void showFiguresTest() {
            ShapeCollector shapeCollector = new ShapeCollector();

            Shape triangle1 = new Triangle(4,2);
            Shape triangle2 = new Triangle(3,6);
            Shape triangle3 = new Triangle(4,4);

            shapeCollector.addFigure(triangle1);
            shapeCollector.addFigure(triangle2);
            shapeCollector.addFigure(triangle3);

            String result = shapeCollector.showFigures();

            Assertions.assertNull(result);
        }

        @Test
        void showEmptyFiguresTest() {
            ShapeCollector shapeCollector = new ShapeCollector();

            String result = shapeCollector.showFigures();

            Assertions.assertEquals("", result);
        }
    }


}
