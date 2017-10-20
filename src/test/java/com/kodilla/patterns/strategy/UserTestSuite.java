package com.kodilla.patterns.strategy;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User daniel = new YGeneration("Daniel Wotny");
        User aga = new Millenials("Aga Budzik");
        User ala = new ZGeneration("Alicja Stonoga");
        //When
        String danielPublisher = daniel.sharePost();
        System.out.println("Daniel: " + danielPublisher);
        String agaPublisher = aga.sharePost();
        System.out.println("Aga: " + agaPublisher);
        String alaPublisher = ala.sharePost();
        System.out.println("Ala: " + alaPublisher);
        //Then
        Assert.assertEquals("I prefer Facebook", danielPublisher);
        Assert.assertEquals("I prefer Twitter", agaPublisher);
        Assert.assertEquals("I prefer Snapchat", alaPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User daniel = new YGeneration("Daniel Wotny");
        //When
        String danielPublisher = daniel.sharePost();
        System.out.println("Daniel: " + danielPublisher);
        daniel.setPublisher(new SnapchatPublisher());
        danielPublisher = daniel.sharePost();
        System.out.println("Daniel: " + danielPublisher);
        //Then
        Assert.assertEquals("I prefer Snapchat", danielPublisher);
    }
}
