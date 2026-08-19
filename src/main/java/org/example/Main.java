package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        IO.println("What is your Full Name: ");
        String fullName=input.nextLine();

        BankAccount bankAccountObject = new BankAccount(fullName);
        bankAccountObject.checkBalance();

        bankAccountObject.deposit(200);
        bankAccountObject.checkBalance();

        bankAccountObject.withdraw(30);
        bankAccountObject.checkBalance();


    }
}