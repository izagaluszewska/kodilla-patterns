package com.kodilla.patterns.factory;

public final class DrivingTask implements Task {
    final private String taskName;
    final private String where;
    final private String using;
    private String executingTask = null;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        executingTask = "I am driving to " + where + " by " + using;
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
