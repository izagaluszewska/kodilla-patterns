package com.kodilla.patterns.builder;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacNew() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .setIngredient("salad")
                .setRoll("roll with sesame")
                .setIngredient("mushrooms")
                .setBurgers(2)
                .setIngredient("cheese")
                .setSauce("standard")
                .setIngredient("bacon")
                .setIngredient("cucumber")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(5, howManyIngredients);
    }
}
