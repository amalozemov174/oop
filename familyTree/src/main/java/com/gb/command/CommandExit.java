package com.gb.command;

public class CommandExit extends Command {
    private final String description = "выйти из программы";
    private final String name = "exit";

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
