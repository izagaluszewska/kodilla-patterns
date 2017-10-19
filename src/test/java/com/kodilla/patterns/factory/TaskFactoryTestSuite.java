package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.chooseTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Buy for breakfast", shoppingTask.getTaskName());
        Assert.assertEquals(false, shoppingTask.isTaskExecuted());
        Assert.assertEquals("I am buying 2.0 bun", shoppingTask.executeTask());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.chooseTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Homework", paintingTask.getTaskName());
        Assert.assertEquals(false, paintingTask.isTaskExecuted());
        Assert.assertEquals("I am painting rose in this color: red", paintingTask.executeTask());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.chooseTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Go work", drivingTask.getTaskName());
        Assert.assertEquals(false, drivingTask.isTaskExecuted());
        Assert.assertEquals("I am driving to Gdansk, Grunwaldzka by car", drivingTask.executeTask());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }
}
