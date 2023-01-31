package com.gb;

import com.gb.command.Command;
import com.gb.command.CommandA;
import com.gb.command.CommandL;
import com.gb.command.CommandExit;
import com.gb.command.CommandToTree;
import com.gb.command.FamilyTreeCommand;
import com.gb.comparator.HumanComparatorByDate;
import com.gb.relation.Human;
import com.gb.relation.Relatives;
import com.gb.tree.FamilyTree;
import com.gb.view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

public class App {


        public static void main(String[] args) throws IOException, ClassNotFoundException {
            FamilyTree familyTree = new FamilyTree();
            FamilyTreeCommand familyTreeCommand = new FamilyTreeCommand(familyTree);
            View view = new View();
            ArrayList<Command> commands = new ArrayList<>();
            CommandA a = new CommandA();
            CommandL l = new CommandL();
            CommandExit exit = new CommandExit();
            commands.add(a);
            commands.add(l);
            commands.add(exit);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String command = "";
            view.getStartWork();
            while (!command.equals(exit.getName())) {
                view.getAllComand(commands);
                command = bufferedReader.readLine();
                if(command.equals(a.getName())){
                    view.addHumanToTree(bufferedReader, familyTreeCommand);
                }
                else if(command.equals(l.getName())){
                    view.getAllFamilyTreeMembers(familyTreeCommand);
                }
                else {
                    view.notRecognizedCommand();
                }

            }
        }

    }
