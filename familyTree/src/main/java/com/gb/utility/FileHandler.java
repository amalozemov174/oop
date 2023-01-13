package com.gb.utility;

import com.gb.relation.Human;

import java.io.*;

public class FileHandler {

    public void write(String path, Serializable serializable) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(serializable);
        objectOutputStream.close();
    }

    public Human read(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        Human human = (Human) objectInputStream.readObject();
        objectInputStream.close();
        return human;
    }

}