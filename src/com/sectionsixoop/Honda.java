package com.sectionsixoop;

public class Honda extends Car {

    private static int topSpeed = 140;
    private static int yearsWarranty = 5;
    private boolean hasSatNav;
    private int usbPorts;
    private boolean isUnderWarranty;

    public Honda() {}

    public Honda(int airbags, boolean hasGloveBox, boolean hasSatNav, int usbPorts, boolean isUnderWarranty) {
        super(airbags, hasGloveBox, 1   );
        this.hasSatNav = hasSatNav;
        this.usbPorts = usbPorts;
        this.isUnderWarranty = isUnderWarranty;
    }

    public Honda(int airbags, boolean hasGloveBox, int currentGear, boolean hasSatNav, int usbPorts, boolean isUnderWarranty) {
        super(airbags, hasGloveBox, currentGear);
        this.hasSatNav = hasSatNav;
        this.usbPorts = usbPorts;
        this.isUnderWarranty = isUnderWarranty;
    }

    public Honda(boolean hasSatNav, int usbPorts) {
        this.hasSatNav = hasSatNav;
        this.usbPorts = usbPorts;
        this.isUnderWarranty = isUnderWarranty();
    }

    public Honda(int currentGear, boolean hasPowerSteering, int speed, int regYear, int airbags, boolean hasGloveBox, boolean hasSatNav, int usbPorts) {
        super(currentGear, hasPowerSteering, speed, regYear, airbags, hasGloveBox);
        this.hasSatNav = hasSatNav;
        this.usbPorts = usbPorts;
        this.isUnderWarranty = isUnderWarranty();
    }

    @Override
    public void setSpeed(int speed) {
        if (speed < 0 || speed > topSpeed) super.setSpeed(0);
        else super.setSpeed(speed);
    }

    public static int getTopSpeed() {
        return topSpeed;
    }

    public static void setTopSpeed(int topSpeed) {
        Honda.topSpeed = topSpeed;
    }

    public static int getYearsWarranty() {
        return yearsWarranty;
    }

    public static void setYearsWarranty(int yearsWarranty) {
        Honda.yearsWarranty = yearsWarranty;
    }

    public boolean hasSatNav() {
        return hasSatNav;
    }

    public void setHasSatNav(boolean hasSatNav) {
        this.hasSatNav = hasSatNav;
    }

    public int getUsbPorts() {
        return usbPorts;
    }

    public void setUsbPorts(int usbPorts) {
        if(usbPorts > 6) this.usbPorts = 2;
        else this.usbPorts = usbPorts;
    }

    public boolean isUnderWarranty() {
        return (2020 - super.getRegYear() <= 5);
    }
}

