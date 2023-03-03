package com.ultralesson.fruitbowl;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FruitBowlTest {
    @Test
    public void testAddFruit() {
        FruitBowl bowl = new FruitBowl();
        Fruit apple = new Fruit("Apple", "Red");
        bowl.addFruit(apple);
        Assert.assertEquals(1, bowl.getFruits().size());
        Assert.assertEquals(apple, bowl.getFruits().get(0));
    }
    @Test
    public void testRemoveFruit() {
        FruitBowl bowl = new FruitBowl();
        Fruit apple = new Fruit("Apple", "Red");
        bowl.addFruit(apple);
        bowl.removeFruit(apple);
        Assert.assertEquals(0, bowl.getFruits().size());
    }

}
