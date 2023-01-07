package com.gb;

import java.io.IOException;
import java.util.Date;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree familyTree = new FamilyTree();
        Human pert = new Human(true, "Petr", "Petrov", new Date(40, 12, 12));
        Human evgenia = new Human(false, "Evgenia", "Petrova", new Date(41, 12, 12));
        Human nadegda = new Human(evgenia, pert, false, "Nadegda", "Ivanova", new Date(80, 12, 12));
        Human olga = new Human(evgenia, pert, false, "Olga", "Ivanova", new Date(90, 12, 12));
        Human vika = new Human(evgenia, pert, false, "Vika", "Ivanova", new Date(92, 12, 12));
        Human luba = new Human(evgenia, pert, false, "Luba", "Ivanova", new Date(93, 12, 12));
        Human julia = new Human(evgenia, pert, false, "Julia", "Ivanova", new Date(94, 12, 12));

        familyTree.addFamilyMember(pert);
        familyTree.addFamilyMember(evgenia);
        familyTree.addFamilyMember(nadegda);
        familyTree.addFamilyMember(olga);

        //evgenia.setChildren(olga);
        //evgenia.setChildren(nadegda);
       // System.out.println(evgenia);
        Relatives relatives = new Relatives(evgenia);
       // System.out.println("evgenia: " + relatives.getChildrens());

        //Serializable
//        FileHandler.write("C:\\Users\\Tolik\\Desktop\\a\\oop\\genealogicalTree\\src\\main\\resources\\human.txt", evgenia);
//        Human h = FileHandler.read("C:\\Users\\Tolik\\Desktop\\a\\oop\\genealogicalTree\\src\\main\\resources\\human.txt");
//        System.out.println(h);
//        Relatives relativesRestored = new Relatives(h);
//        System.out.println("Restored: " + h.getChildrens());

        //Iterator
//        for (Human human : familyTree) {
//            System.err.println(human.getChildrens());
//        }
        //Comparator
        System.out.println(familyTree.getFamilyTree());
        HumanComparatorByDate humanComparatorByDate = new HumanComparatorByDate();
        familyTree.sortByDate(humanComparatorByDate);
        System.out.println(familyTree.getFamilyTree());
    }

}
