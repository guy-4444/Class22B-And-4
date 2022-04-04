package com.guy.class22b_and_4;

import java.util.ArrayList;
import java.util.HashMap;

public class Tattoo {

    public enum SIZE {
        SMALL,
        MEDIUM,
        LARGE,
        HUGE
    }

    private ArrayList<String> colors = new ArrayList<>();
    private SIZE size = SIZE.MEDIUM;
    private double price = 0;
    private boolean originalDesign = true;
    private String name = "";
    private HashMap<String, Integer> needles = new HashMap<>();
    private int painLevel = 1;
    private Artist artist = null;

    public Tattoo() { }

    public ArrayList<String> getColors() {
        return colors;
    }

    public Tattoo setColors(ArrayList<String> colors) {
        this.colors = colors;
        return this;
    }

    public SIZE getSize() {
        return size;
    }

    public Tattoo setSize(SIZE size) {
        this.size = size;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Tattoo setPrice(double price) {
        this.price = price;
        return this;
    }

    public boolean isOriginalDesign() {
        return originalDesign;
    }

    public Tattoo setOriginalDesign(boolean originalDesign) {
        this.originalDesign = originalDesign;
        return this;
    }

    public String getName() {
        return name;
    }

    public Tattoo setName(String name) {
        this.name = name;
        return this;
    }

    public HashMap<String, Integer> getNeedles() {
        return needles;
    }

    public Tattoo setNeedles(HashMap<String, Integer> needles) {
        this.needles = needles;
        return this;
    }

    public int getPainLevel() {
        return painLevel;
    }

    public Tattoo setPainLevel(int painLevel) {
        this.painLevel = painLevel;
        return this;
    }

    public Artist getArtist() {
        return artist;
    }

    public Tattoo setArtist(Artist artist) {
        this.artist = artist;
        return this;
    }
}
