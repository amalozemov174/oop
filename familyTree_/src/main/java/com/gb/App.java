package com.gb;

import com.gb.command.*;
import com.gb.tree.FamilyTree;
import com.gb.utility.FileHandler;
import com.gb.view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {


        public static void main(String[] args) throws IOException, ClassNotFoundException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            FileHandler fileHandler = new FileHandler();
            FamilyTree familyTree = new FamilyTree();
            FamilyTreeCommand familyTreeCommand = new FamilyTreeCommand(familyTree);
            View view = new View(familyTreeCommand, bufferedReader);
            ArrayList<Command> commands = new ArrayList<>();
            CommandAddFamilyMember addFamilyMember = new CommandAddFamilyMember(view);
            CommandListFamilyMembers listFamilyMembers = new CommandListFamilyMembers(view);
            CommandExit exit = new CommandExit(view);
            CommandSaveTree commandSaveTree = new CommandSaveTree(view, "src/main/resources/save.txt", fileHandler);
            CommandLoadFromFile commandLoadFromFile = new CommandLoadFromFile(view, "src/main/resources/save.txt", fileHandler);
            CommandSortFamilyTree commandSortFamilyTree = new CommandSortFamilyTree(view);
            commands.add(addFamilyMember);
            commands.add(listFamilyMembers);
            commands.add(exit);
            commands.add(commandSaveTree);
            commands.add(commandLoadFromFile);
            commands.add(commandSortFamilyTree);
            String command = "";
            view.getStartWork();
            while (true) {
                view.getAllComand(commands);
                command = bufferedReader.readLine();
                for (Command c : commands) {
                    if(command.equals(c.getName())) {
                        c.execute();
                    }
                }
            }
        }

    }
