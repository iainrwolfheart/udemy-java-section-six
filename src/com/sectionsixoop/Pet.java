package com.sectionsixoop;

public class Pet {

    private static int legs;
    private int ears;
    private boolean hasTail;
    private boolean hasFur;

    public Pet() {
        this(4, 2);
    }

    public Pet (boolean hasFur) {
        this(4, 2, true, hasFur);
    }

    public Pet(int legs, int ears) {
        this(legs, ears, true, true);
    }

    public Pet(int legs, int ears, boolean hasTail, boolean hasFur) {
        this.legs = legs;
        this.ears = ears;
        this.hasTail = hasTail;
        this.hasFur = hasFur;
    }

    public void quietNoise() {
        System.out.println("Hello");
    }

    public void loudNoise() {
        System.out.println("Roar");
    }

    public void eats() {
        System.out.println("I eat food");
    }

    public void move() {
        System.out.println("This animal moves");
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEars() {
        return ears;
    }

    public void setEars(int ears) {
        this.ears = ears;
    }

    public boolean hasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public boolean hasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
}
