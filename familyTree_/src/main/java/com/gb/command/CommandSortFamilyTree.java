package com.gb.command;

import com.gb.sort.SortByDate;
import com.gb.sort.SortByName;
import com.gb.sort.SortMethod;
import com.gb.view.View;

import java.io.IOException;
import java.util.ArrayList;

public class CommandSortFamilyTree extends Command {

    ArrayList<SortMethod> sortMethods;
    private final View view;

    public CommandSortFamilyTree(View view){
        sortMethods = new ArrayList<>();
        sortMethods.add(new SortByDate());
        sortMethods.add(new SortByName());
        this.view = view;
    }

    @Override
    public String getDescription() {
        return "Выбрать сортировку членов семьи";
    }

    @Override
    public String getName() {
        return "sort";
    }

    @Override
    public void execute() throws IOException, ClassNotFoundException {
        view.sortFamilyTree(sortMethods);
    }
}
