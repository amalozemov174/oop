package com.gb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class FamilyTree implements Iterable<Human> {

    private ArrayList<Human> familyTree;

    public FamilyTree() {
        familyTree = new ArrayList<>();
    }

    public void addFamilyMember(Human human) {
        familyTree.add(human);
    }

    public Human getRelativeByName(String name) {
        Human tmp = null;
        for(Human human : familyTree){
            if(human.getName().equals(name)) {
                tmp = human;
            }
        }
        return tmp;
    }

    @Override
    public Iterator<Human> iterator() {
        return familyTree.iterator();
    }

    public void sortByName() {
        Collections.sort(familyTree);
    }

    public void sortByDate(HumanComparatorByDate comparatorByDate) {
        Collections.sort(familyTree, comparatorByDate);
    }

    public ArrayList<Human> getFamilyTree() {
        return this.familyTree;
    }
}
