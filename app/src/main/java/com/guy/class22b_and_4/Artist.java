package com.guy.class22b_and_4;

public class Artist {
    private String name = "";
    private int experience = 0;
    private boolean male = false;

    public Artist() { }

    public String getName() {
        return name;
    }

    public Artist setName(String name) {
        this.name = name;
        return this;
    }

    public int getExperience() {
        return experience;
    }

    public Artist setExperience(int experience) {
        this.experience = experience;
        return this;
    }

    public boolean isMale() {
        return male;
    }

    public Artist setMale(boolean male) {
        this.male = male;
        return this;
    }
}
