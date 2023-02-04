package com.gb.command;

import com.gb.relation.Human;
import com.gb.tree.FamilyTree;
import com.gb.utility.FileHandler;
import com.gb.view.View;

import java.io.IOException;

public class CommandLoadFromFile extends Command {

    private final View view;
    private final String path;
    private final FileHandler fileHandler;

    public CommandLoadFromFile(View view, String path, FileHandler fileHandler) {
        this.view = view;
        this.path = path;
        this.fileHandler = fileHandler;
    }

    @Override
    public String getDescription() {
        return "загрузить людей из файла";
    }

    @Override
    public String getName() {
        return "load";
    }

    @Override
    public void execute() throws IOException, ClassNotFoundException {
        view.loadFamilyTree(path, fileHandler);
    }
}
