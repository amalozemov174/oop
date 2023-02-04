package com.gb.command;

import java.io.IOException;

public abstract class Command {

    public abstract String getDescription();

    public abstract String getName();

    public abstract void execute() throws IOException, ClassNotFoundException;

}
