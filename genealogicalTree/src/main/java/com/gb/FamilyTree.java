package com.gb;

import java.util.ArrayList;

public class FamilyTree {

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

}
