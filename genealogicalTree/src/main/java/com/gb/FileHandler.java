package com.gb;

import java.io.*;
import java.nio.Buffer;

public class FileHandler {

    public static void write(String path, Serializable serializable) throws IOException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(serializable);
        objectOutputStream.close();

    }

    public static Human read(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        Human human = (Human) objectInputStream.readObject();
        objectInputStream.close();
        return human;
    }

}
