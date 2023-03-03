package com.ultralesson.fruitbowl;

import java.util.ArrayList;
import java.util.List;

public class FruitBowl {
    private List<Fruit> fruits;

    public FruitBowl() {
        fruits = new ArrayList<>();
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public void removeFruit(Fruit fruit) {
        fruits.remove(fruit);
    }

    public List<Fruit> getFruits() {
        return fruits;
    }
}


