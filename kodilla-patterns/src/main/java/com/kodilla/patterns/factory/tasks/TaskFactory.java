package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskType) {
        return switch (taskType) {
            case SHOPPING -> new ShoppingTask("shopping", "orange", 2);
            case PAINTING -> new PaintingTask("painting", "violet", "elephant");
            case DRIVING -> new DrivingTask("driving", "Warsaw", "car");
            default -> null;
        };
    }
}
