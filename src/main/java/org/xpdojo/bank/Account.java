package org.xpdojo.bank;

public class Account {

    private double amount;
    public Account() {
        amount = 0;
    }

    public double checkAccount(){
        return amount;
    }

    public void deposit(double amount) {

        this.amount = this.amount + amount;
    }

    public void withdraw(double amount){
        if(amount > this.amount)
            throw new IllegalArgumentException("Not enough money");

        this.amount = this.amount - amount;
    }
}
