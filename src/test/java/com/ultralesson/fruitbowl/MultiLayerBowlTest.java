package com.ultralesson.fruitbowl;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class MultiLayerBowlTest {
    @Test
    public void testSegregateFruits() {
        // Create a fruit bowl and add some fruits
        FruitBowl fruitBowl = new FruitBowl();
        fruitBowl.addFruit(new Fruit("Apple", "Red"));
        fruitBowl.addFruit(new Fruit("Banana", "Yellow"));
        fruitBowl.addFruit(new Fruit("Orange", "Orange"));
        fruitBowl.addFruit(new Fruit("Strawberry", "Red"));
        fruitBowl.addFruit(new Fruit("Grape", "Green"));
        fruitBowl.addFruit(new Fruit("Kiwi", "Green"));

        // Create a multi-layer bowl and segregate the fruits by color
        MultiLayerBowl multiLayerBowl = new MultiLayerBowl();
        multiLayerBowl.segregateFruits(fruitBowl);

        // Get the segregated fruits and assert that they are correct
        Map<String, List<Fruit>> segregatedFruits = multiLayerBowl.getSegregatedFruits();
        Assert.assertEquals(4, segregatedFruits.size());
        Assert.assertEquals(2, segregatedFruits.get("Red").size());
        Assert.assertEquals(1, segregatedFruits.get("Yellow").size());
        Assert.assertEquals(2, segregatedFruits.get("Green").size());
    }
}
