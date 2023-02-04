package com.gb.command;

import com.gb.view.View;

public class CommandExit extends Command {
    private final String description = "выйти из программы";
    private final String name = "exit";
    private final View view;

    public CommandExit(View view) {
        this.view = view;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}
