package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert your full name to create an account: ");
        String ownerName = scan.nextLine();

        BankAccount account = new BankAccount(ownerName);
        System.out.println("Your new account: " + account.toString());

        String ownerChoice = "";

        while (!ownerChoice.equals("3")) {
            System.out.println("  ");
            System.out.print("What are you gonna do next? 1 Add Money |  2 Withdraw Money | 3 Exit");
            ownerChoice = scan.nextLine();
            System.out.println("  ");

            if(ownerChoice.equals("1")){

                System.out.println("How many money do you want to add?");
                double money = Double.parseDouble(scan.nextLine());

                System.out.println("  ");

                account.addMoney(money);


            } else if (ownerChoice.equals("2")) {

                System.out.println("How many money do you want to withdraw?");

                double money = Double.parseDouble(scan.nextLine());

                System.out.println("  ");

                account.withdrawMoney(money);

            }

            System.out.println("  ");

            System.out.println("Your account: " + account.toString());

        }

        scan.close();
    }
}
