package com.sectionsixoop;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public  VipCustomer() {
        this("Archie", 100.00, "archiewolfy@home.com");
    }

    public VipCustomer(double creditLimit) {
        this("Archie2", creditLimit, "archie2@home.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


}
