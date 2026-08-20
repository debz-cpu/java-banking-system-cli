package org.example;

public class BankAccount {
    private  String name;
    private double balance  = 0;

    public BankAccount(String fullName){
        name = fullName;
        balance = 0.0;
    }

    public void deposit(double amount){


        if (amount >0){
            balance += amount;
            IO.println("Deposited: € "+ amount );
        }else {
            IO.println("Transaction failed: Type a positive number");
        }
    }

    public void withdraw(double amount){

        if (balance >= amount && amount > 0) {
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
