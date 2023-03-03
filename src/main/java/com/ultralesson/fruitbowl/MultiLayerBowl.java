package com.ultralesson.fruitbowl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiLayerBowl {
    private Map<String, List<Fruit>> segregatedFruits;

    public MultiLayerBowl() {
        segregatedFruits = new HashMap<>();
    }

    public void segregateFruits(FruitBowl fruitBowl) {
        for (Fruit fruit : fruitBowl.getFruits()) {
            String color = fruit.getColor();
            if (segregatedFruits.containsKey(color)) {
                segregatedFruits.get(color).add(fruit);
            } else {
                List<Fruit> newFruitList = new ArrayList<>();
                newFruitList.add(fruit);
                segregatedFruits.put(color, newFruitList);
            }
        }
    }

    public Map<String, List<Fruit>> getSegregatedFruits() {
        return segregatedFruits;
    }

}
