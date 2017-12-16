package com.kodilla.patterns.factory;

public final class ShoppingTask implements Task {
    final private String taskName;
    final private String whatToBuy;
    final private double quantity;
    private String executingTask = null;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        executingTask = "I am buying " + quantity + " " + whatToBuy;
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
