package com.gb;

public class App {

    public static void main(String[] args) {
        Human pert = new Human(null, null, true, "Petr", "Petrov");
        Human evgenia = new Human(null, null,false, "Evgenia", "Petrova");
        Human nadegda = new Human(evgenia, pert, false, "Nadegda", "Ivanova");
        Human olga = new Human(evgenia, pert, false, "Olga", "Ivanova");
        evgenia.setChildren(olga);
        evgenia.setChildren(nadegda);
        Relatives relatives = new Relatives(evgenia);
        System.out.println(relatives.getChildrens());
    }

}
