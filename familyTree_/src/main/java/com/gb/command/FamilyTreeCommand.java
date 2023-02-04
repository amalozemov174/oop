package com.gb.command;

import com.gb.relation.Human;
import com.gb.tree.FamilyTree;
import com.gb.utility.FileHandler;

import java.io.IOException;
import java.util.ArrayList;

public class FamilyTreeCommand {

    private FamilyTree<Human> familyTree;

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

    public FamilyTree<Human> getFamilyTree() {
        return this.familyTree;
    }

    public Human getFamilyMemberByNameAndSurname(String parentName, String parentSurname) {
        return familyTree.getRelativeByNameAndSurname(parentName, parentSurname);
    }

    public void saveFamilyTree(String path, FileHandler fileHandler) throws IOException {
        fileHandler.write(path, familyTree);
    }

    public void loadFamilyTree(String path, FileHandler fileHandler) throws IOException, ClassNotFoundException {
        familyTree = fileHandler.read(path);
    }
}
