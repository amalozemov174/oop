package com.gb.command;

import com.gb.view.View;

public class CommandListFamilyMembers extends Command {
    private final String description = "показать семейное древо";
    private final String name = "list";
    private final View view;

    public CommandListFamilyMembers(View view) {
        this.view = view;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void execute() {
        this.view.getAllFamilyTreeMembers();
    }
}
