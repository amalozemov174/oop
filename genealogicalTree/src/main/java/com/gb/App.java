package com.gb;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree familyTree = new FamilyTree();
        Human pert = new Human(true, "Petr", "Petrov");
        Human evgenia = new Human(false, "Evgenia", "Petrova");
        Human nadegda = new Human(evgenia, pert, false, "Nadegda", "Ivanova");
        Human olga = new Human(evgenia, pert, false, "Olga", "Ivanova");

        familyTree.addFamilyMember(pert);
        familyTree.addFamilyMember(evgenia);
        familyTree.addFamilyMember(nadegda);
        familyTree.addFamilyMember(olga);

        //evgenia.setChildren(olga);
        //evgenia.setChildren(nadegda);
        System.out.println(evgenia);
        Relatives relatives = new Relatives(evgenia);
        System.out.println("evgenia: " + relatives.getChildrens());

        FileHandler.write("C:\\Users\\Tolik\\Desktop\\a\\oop\\genealogicalTree\\src\\main\\resources\\human.txt", evgenia);
        Human h = FileHandler.read("C:\\Users\\Tolik\\Desktop\\a\\oop\\genealogicalTree\\src\\main\\resources\\human.txt");
        System.out.println(h);
        Relatives relativesRestored = new Relatives(h);
        System.out.println("Restored: " + h.getChildrens());
    }

}
