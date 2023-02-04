package com.gb.utility;

import com.gb.relation.Human;
import com.gb.tree.FamilyTree;

import java.io.*;

public class FileHandler {

    public void write(String path, Serializable serializable) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(serializable);
        objectOutputStream.close();
    }

    public FamilyTree<Human> read(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        FamilyTree<Human> familyTree = (FamilyTree<Human>) objectInputStream.readObject();
        objectInputStream.close();
        return familyTree;
    }

}