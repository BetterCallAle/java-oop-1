package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Random;

public class BankAccount {
    private int number;
    private String owner;
    private double bill;

    //Constructor
    public BankAccount(String owner){
        Random random = new Random();
        number = random.nextInt(1001);
        this.owner = owner;
        bill = 0;
    }

    //Getter

    public int getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public String getBill() {
        return new DecimalFormat("#.##").format(bill);
    }

    //Setter
    public void setOwner(String owner){
        this.owner = owner;
    }

    //Methods

    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", owner='" + owner + '\'' +
                ", bill=" + bill +
                '}';
    }

    public void addMoney(double money){
        bill += money;
    }

    public void withdrawMoney(double money){
        if(money < bill){
            bill -= money;
        } else {
            System.out.println("You can't withdraw this amount of money");
        }
    }
}
