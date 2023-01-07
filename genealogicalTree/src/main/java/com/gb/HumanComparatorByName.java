package com.gb;

import java.util.Comparator;

public class HumanComparatorByName implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        return h2.getName().compareTo(h2.getName());
    }
}
