package com.gb.command;

public enum CommandToTree {
    Create("a"), Delete("d"), Update("u"), List("l");

    private String name;

    private CommandToTree(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
