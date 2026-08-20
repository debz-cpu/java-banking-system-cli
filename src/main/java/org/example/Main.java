package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        IO.println(" What is your Full Name: ");
        String fullName=input.nextLine();
        BankAccount bankAccountObject = new BankAccount(fullName);

        // Choice variable needs to exist outside the do while loop
        int choice;

        // do to loop throw over and over again as long as the user does choose 4
        do {
            //Display options Menu
            IO.println("\n-- Bank Menu ---");
            IO.println("1. Check Balance");
            IO.println("2. Deposit Money");
            IO.println("3. Withdraw Money");
            IO.println("4. Exit");


            //Read user's menu choice
            choice =input.nextInt();

            //Depending on the User's choice do the following
            if (choice == 1){
                bankAccountObject.checkBalance();
            } else if (choice == 2) {
                IO.println("Enter the amount to deposit: € ");
                double depositAmount =input.nextDouble();
                bankAccountObject.deposit(depositAmount);
            } else if (choice == 3) {
                IO.println("Enter the amount to withdraw: € ");
                double withdrawAmount = input.nextDouble();
                bankAccountObject.withdraw(withdrawAmount);
                bankAccountObject.checkBalance();
            }else if (choice == 4){
                IO.println("Thank you for using our service. GoodBbye!");
            }else {
                IO.println("Invalid option. Please try again");
            }

        }while(choice !=4);


        // To close Scanner to free up  resource
        input.close();
    }
}