package com.gb;

import java.io.Serializable;
import java.util.*;

public class Human implements Serializable {

    private String name;
    private String surname;
    private Map<Relation, ArrayList<Human>> relatives;
    private Boolean male;

    private ArrayList<Human> childrenList;

    public Human(Boolean male, String name, String surname) {
        relatives = new HashMap<>();
        this.male = male;
        this.name = name;
        this.surname = surname;
        childrenList = new ArrayList<>();
    }

    public Human(Human mother, Human father, Boolean male, String name, String surname){
        relatives = new HashMap<>();
        this.male = male;
        this.name = name;
        this.surname = surname;
        childrenList = new ArrayList<>();
        ArrayList<Human> fathers = new ArrayList<Human>();
        if(father != null){
            fathers.add(father);
        }
        ArrayList<Human> mothers = new ArrayList<Human>();
        if(mother != null){
            fathers.add(mother);
        }
        mother.setChildren(this);
        father.setChildren(this);
//        relatives.put(Relation.Father, fathers);
//        relatives.put(Relation.Mother, mothers);
    }


    public Human getFather() {
        return this.relatives.get(Relation.Father).get(0);
    }

    public Human getMother() {
        return this.relatives.get(Relation.Mother).get(0);
    }

    public List<Human> getSisters() {
        return this.relatives.get(Relation.Sister);
    }

    public List<Human> getBrotherss() {
        return this.relatives.get(Relation.Brother);
    }

    public List<Human> getChildrens() {
        return this.relatives.get(Relation.Child);
    }

    public Human getPartner() {
        if(male) {
            return this.relatives.get(Relation.Wife).get(0);
        }
        else {
            return this.relatives.get(Relation.Husband).get(0);
        }
    }

    public void setPartner(Human partner){
        if(male) {
            this.relatives.get(Relation.Wife).add(partner);
        }
        else {
            this.relatives.get(Relation.Husband).add(partner);
        }
    }

    public void setSister(Human sister) {
        if(this.relatives.get(Relation.Sister) == null){
            ArrayList<Human> sisters = new ArrayList<>();
            sisters.add(sister);
            relatives.put(Relation.Sister, sisters);
        }
        else {
            this.relatives.get(Relation.Sister).add(sister);
        }
    }

    public void setBrother(Human brother) {
        if(this.relatives.get(Relation.Brother) == null){
            ArrayList<Human> brothers = new ArrayList<>();
            brothers.add(brother);
            relatives.put(Relation.Brother, brothers);
        }
        else {
            this.relatives.get(Relation.Brother).add(brother);
        }
    }

    public void setChildren(Human child) {
        if(this.relatives.get(Relation.Child) == null){
            ArrayList<Human> childrens = new ArrayList<>();
            childrens.add(child);
            relatives.put(Relation.Child, childrens);
        }
        else {
            this.relatives.get(Relation.Child).add(child);
        }
        childrenList.add(child);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", male=" + male +
                '}';
    }
}
