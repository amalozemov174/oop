package com.gb.command;

import com.gb.relation.Human;
import com.gb.tree.FamilyTree;

import java.util.ArrayList;

public class FamilyTreeCommand {

    private final FamilyTree<Human> familyTree;

    public FamilyTreeCommand(FamilyTree<Human> familyTree) {
        this.familyTree = familyTree;
    }

    public void addFamilyMember(Human human) {
        familyTree.addFamilyMember(human);
    }

    public void deleteFromFamilyTree(Human human) {
        familyTree.removeMember(human);
    }

    public ArrayList<Human> getFamilyMembers() {
        return familyTree.getFamilyTree();
    }


    public Human getFamilyMemberByNameAndSurname(String parentName, String parentSurname) {
        return familyTree.getRelativeByNameAndSurname(parentName, parentSurname);
    }
}
