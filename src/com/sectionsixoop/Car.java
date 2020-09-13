package com.sectionsixoop;

public class Car extends Vehicle {

    private int airbags;
    private boolean hasGloveBox;
    private int currentGear;

    public Car(int airbags, boolean hasGloveBox, int currentGear) {
        this.airbags = airbags;
        this.hasGloveBox = hasGloveBox;
        this.currentGear = currentGear;
    }

    public Car() {}

    public Car(int currentGear, boolean hasPowerSteering, int speed, int regYear, int airbags, boolean hasGloveBox) {
        super(hasPowerSteering, speed, regYear);
        this.airbags = airbags;
        this.hasGloveBox = hasGloveBox;
        this.currentGear = currentGear;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        if (currentGear < 1 || currentGear > 6) this.currentGear = 1;
        else this.currentGear = currentGear;
    }

    public int getAirbags() {
        return airbags;
    }

    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }

    public boolean hasGloveBox() {
        return hasGloveBox;
    }

    public void setHasGloveBox(boolean hasGloveBox) {
        this.hasGloveBox = hasGloveBox;
    }
}
