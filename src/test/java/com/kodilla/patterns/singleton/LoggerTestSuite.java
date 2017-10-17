package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLog() {
        //Given
        Logger logger = Logger.getInstance();
        //When
        String log123 = logger.log("123");
        String log456 = logger.log("456");
        //Then
        Assert.assertEquals("123", log123);
        Assert.assertEquals("456", log456);
    }

    @Test
    public void testGetLastLog() {
        //Given
        Logger logger = Logger.getInstance();
        //When
        String lastLog = logger.getLastLog();
        //Then
        Assert.assertEquals("456", lastLog);
    }
}
