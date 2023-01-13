package com.gb;

import java.util.Comparator;

public class HumanComparatorByDate implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        return h2.getBirthDate().compareTo(h1.getBirthDate());
    }
}
