package com.gb.command;

import com.gb.utility.FileHandler;
import com.gb.view.View;

import java.io.IOException;

public class CommandSaveTree extends Command{

    private final View view;
    private final String path;
    private final FileHandler fileHandler;

    public CommandSaveTree(View view, String path, FileHandler fileHandler) {
        this.view = view;
        this.path = path;
        this.fileHandler = fileHandler;
    }

    @Override
    public String getDescription() {
        return "сохранить семейное дерево";
    }

    @Override
    public String getName() {
        return "save";
    }

    @Override
    public void execute() throws IOException {
        view.saveFamilyTree(path, fileHandler);
    }
}
