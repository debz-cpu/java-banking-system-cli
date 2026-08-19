package org.example;

public class BankAccount {
    private  String name;
    private double balance  = 0;

    public BankAccount(String fullName){
        name = fullName;
        balance = 0.0;
    }

    public void deposit(double amount){
        balance += amount;
        IO.println("Deposited: € "+ amount );
    }

    public void withdraw(double amount){

        if (balance >= amount) {
            balance -= amount;
            IO.println("Withdrew: € "+ amount);
        }else {
            IO.println("Transaction failed: Insufficient funds");
        }
    }


    public void checkBalance(){
        IO.println(name + " | Current Balance: € "+ balance);
    }
}
