package com.gb.sort;

import com.gb.comparator.HumanComparatorByDate;
import com.gb.tree.FamilyTree;

import java.io.IOException;

public class SortByDate extends SortMethod{
    @Override
    public String getDescription() {
        return "сортировка по дате";
    }

    @Override
    public String getName() {
        return "date sorting";
    }

    @Override
    public void execute(FamilyTree familyTree) throws IOException, ClassNotFoundException {
        HumanComparatorByDate humanComparatorByDate = new HumanComparatorByDate();
        familyTree.sortByDate(humanComparatorByDate);
    }
}
