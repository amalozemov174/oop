package com.gb.comparator;

import com.gb.relation.Human;

import java.util.Comparator;

public class HumanComparatorByName implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        return h2.getName().compareTo(h2.getName());
    }
}
