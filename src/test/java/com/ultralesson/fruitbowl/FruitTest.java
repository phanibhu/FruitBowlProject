package com.ultralesson.fruitbowl;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FruitTest {
    @Test
    public void testGetColor() {
        Fruit fruit = new Fruit("Apple", "Red");
        Assert.assertEquals("Red", fruit.getColor());
    }

    @Test
    public void testGetName() {
        Fruit fruit = new Fruit("Apple", "Red");
        Assert.assertEquals("Apple", fruit.getName());
    }
}
