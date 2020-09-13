package com.sectionsixoop;

public class Rabbit extends Pet {

    private int binkies;
    private int hypers;

    public Rabbit() {
        super();
    }

    public Rabbit(boolean hasFur, int binkies, int hypers) {
        super(hasFur);

        }

    public Rabbit(int legs, int ears, int binkies, int hypers) {
        this(legs, ears, true, true, binkies, hypers);
    }

    public Rabbit(int legs, int ears, boolean hasTail, boolean hasFur, int binkies, int hypers) {
        super(legs, ears, hasTail, hasFur);
        this.binkies = binkies;
        this.hypers = hypers;
    }

    @Override
    public void move() {
        System.out.println("Overriding the super.move() method...");
        System.out.println("Rabbit hops");
    }

    public void eats() {
        System.out.println("Calling the super method from here...");
        super.eats();
    }

    public void rabbitNoise() {
        System.out.println("Calling different method in Super class...");
        super.quietNoise();
    }

    public int getBinkies() {
        return binkies;
    }

    public void setBinkies(int binkies) {
        this.binkies = binkies;
    }

    public int getHypers() {
        return hypers;
    }

    public void setHypers(int hypers) {
        this.hypers = hypers;
    }
}
