package com.gb.command;

public class CommandA extends Command {
    private final String description = "добавить члена семьи";
    private final String name = "a";

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
