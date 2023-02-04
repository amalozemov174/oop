package com.gb.sort;

import com.gb.comparator.HumanComparatorByDate;
import com.gb.comparator.HumanComparatorByName;
import com.gb.tree.FamilyTree;

import java.io.IOException;

public class SortByName extends SortMethod{
    @Override
    public String getDescription() {
        return "сортировка по имени";
    }

    @Override
    public String getName() {
        return "name sorting";
    }

    @Override
    public void execute(FamilyTree familyTree) throws IOException, ClassNotFoundException {
        HumanComparatorByName humanComparatorByName = new HumanComparatorByName();
        familyTree.sortByName(humanComparatorByName);
    }
}
