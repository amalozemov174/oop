package com.gb.command;

import com.gb.view.View;

import java.io.IOException;

public class CommandAddFamilyMember extends Command {
    private final String description = "добавить члена семьи";
    private final String name = "add";
    private final View view;

    public CommandAddFamilyMember(View view) {
        this.view = view;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public void execute() throws IOException {
        view.addHumanToTree();
    }
}
