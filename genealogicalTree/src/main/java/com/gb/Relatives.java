package com.gb;

import java.util.List;

public class Relatives {

    private Human human;

    public Relatives(Human human) {
        this.human = human;
    }

    public List<Human> getChildrens() {
        return human.getChildrens();
    }

    public Human getFather() {
        return human.getFather();
    }

    public Human getGrandFather() {
        return human.getFather().getFather();
    }

    public Human getMother() {
        return human.getMother();
    }

    public Human getGarndMother() {
        return human.getMother().getMother();
    }

    public Human getMotherInLaw() {
        return human.getPartner().getMother();
    }

    public Human getFatherInLaw() {
        return human.getPartner().getFather();
    }

}
