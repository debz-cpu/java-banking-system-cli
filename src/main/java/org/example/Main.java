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


        //Display options Menu
        IO.println("What would you like to do today");
        IO.println("\n-- Bank Menu ---");
        IO.println("1. Check Balance");
        IO.println("2.Deposit Money");
        IO.println("3. Withdraw Money");

        //Read user's menu choice
        int choice =input.nextInt();

        if (choice == 1){
            bankAccountObject.checkBalance();
        } else if (choice == 2) {
            IO.println("Enter the amount to deposit: € ");
            double depositAmount =input.nextDouble();
            bankAccountObject.deposit(depositAmount);
        } else if (choice == 3) {
            IO.println("Enter the amount to widthdraw: € ");
            double withdrawAmount = input.nextDouble();
            bankAccountObject.withdraw(withdrawAmount);
            bankAccountObject.checkBalance();
        }


    }
}