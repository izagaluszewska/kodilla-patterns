package com.kodilla.patterns.factory;

public final class PaintingTask implements Task {
    final private String taskName;
    final private String color;
    final private String whatToPaint;
    private String executingTask = null;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        executingTask = "I am painting " + whatToPaint + " in this color: " + color;
        return executingTask;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (executingTask != null) {
            System.out.println("Task \"" + taskName + "\" executed");
        } else {
            System.out.println("Task \"" + taskName + "\" not executed");
        }
        return executingTask != null;
    }
}
