package com.gb.sort;

import com.gb.tree.FamilyTree;

import java.io.IOException;

public abstract class SortMethod {
    public abstract String getDescription();

    public abstract String getName();

    public abstract void execute(FamilyTree familyTree) throws IOException, ClassNotFoundException;
}
