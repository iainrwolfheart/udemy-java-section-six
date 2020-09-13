package com.sectionsixoop;

public class BankAccount {

    private String name;
    private String email;
    private int accNo;
    private double balance;

    public BankAccount(String name, String email, int accNo, double balance) {
        this.name = name;
        this.email = email;
        this.accNo = accNo;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(double amt) {
        this.balance += amt;
        System.out.println("New balance = £" + this.balance);
    }

    public void withdrawal(double amt) {
        if (this.balance < amt) System.out.println("Insufficient funds");
        else {
            this.balance -= amt;
            System.out.println("New balance = £" + this.balance);
        }
    }

}
