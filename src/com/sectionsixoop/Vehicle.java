package com.sectionsixoop;

public class Vehicle {

    private static int wheels;
    private boolean hasPowerSteering;
    private int speed;
    private int regYear;

    public Vehicle() {}

    public Vehicle(boolean hasPowerSteering, int speed, int regYear) {
        wheels = 4;
        this.hasPowerSteering = hasPowerSteering;
        this.speed = speed;
        this.regYear = regYear;
    }

    public static int getWheels() {
        return wheels;
    }

    public boolean hasPowerSteering() {
        return hasPowerSteering;
    }

    public void setHasPowerSteering(boolean hasPowerSteering) {
        this.hasPowerSteering = hasPowerSteering;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) this.speed = 0;
        else this.speed = speed;
    }

    public int getRegYear() {
        return regYear;
    }

    public void setRegYear(int regYear) {
        this.regYear = regYear;
    }
}
