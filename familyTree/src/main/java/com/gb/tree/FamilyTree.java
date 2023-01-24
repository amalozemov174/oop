package com.gb.tree;

import com.gb.comparator.HumanComparatorByDate;
import com.gb.relation.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FamilyTree<T extends Human> implements Iterable<T> {

    private ArrayList<T> familyTree;

    public FamilyTree() {
        familyTree = new ArrayList<>();
    }

    public void addFamilyMember(T human) {
        familyTree.add(human);
    }

    public T getRelativeByName(String name) {
        T tmp = null;
        for(T human : familyTree){
            if(human.getName().equals(name)) {
                tmp = human;
            }
        }
        return tmp;
    }

    @Override
    public Iterator<T> iterator() {
        return familyTree.iterator();
    }

    public void sortByName() {
        Collections.sort(familyTree);
    }

    public void sortByDate(HumanComparatorByDate comparatorByDate) {
        Collections.sort(familyTree, comparatorByDate);
    }

    public ArrayList<T> getFamilyTree() {
        return this.familyTree;
    }

    public void removeMember(T human) {
        familyTree.remove(human);
    }

    public T getRelativeByNameAndSurname(String parentName, String parentSurname) {
        T tmp = null;
        for(T human : familyTree){
            if(human.getName().equals(parentName) && human.getSurname().equals(parentSurname)) {
                tmp = human;
            }
        }
        return tmp;
    }
}
