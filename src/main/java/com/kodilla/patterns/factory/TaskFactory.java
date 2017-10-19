package com.kodilla.patterns.factory;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task chooseTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy for breakfast", "bun", 2.0);
            case PAINTING:
                return new PaintingTask("Homework", "red", "rose");
            case DRIVING:
                return new DrivingTask("Go work", "Gdansk, Grunwaldzka", "car");
            default:
                return null;
        }
    }
}
