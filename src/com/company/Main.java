package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Accessing Inner class (Inner class Encapsulation)
        System.out.println("\n<----Inner class start ---->");
        System.out.println();

        Accounts accounts = new Accounts();
        accounts.addAccount(accounts.new Account(1, 12.2));
        accounts.addAccount(accounts.new Account(2, 2334.4));
        accounts.addAccount(accounts.new Account(3, 34));


        accounts.Credit( 1, 100.15);
        accounts.Credit( 2, 100.0);
        accounts.Credit( 3, 100.2234);

        accounts.Debit( 1, 200.15);
        accounts.Debit( 2, 100.0);
        accounts.Debit( 3, 100.2234);

        accounts.getAccounts();

        System.out.println("\n<---- Inner class Ends ---->");
        System.out.println();

        //Accessing Inner Method (Inner Method Encapsulation)
        System.out.println("\n<----Inner Method start ---->");
        System.out.println();

        accounts.AccountValidator(1);
        accounts.AccountValidator(2);
        accounts.AccountValidator(3);
        accounts.AccountValidator(4);
        accounts.AccountValidator(50);

        System.out.println("\n<---- Inner Method Ends ---->");
        System.out.println();

        //Anonymous Method Encapsulation)
        System.out.println("\n<---- Anonymous Method start ---->");
        System.out.println();

        accounts.AnonymousAccountValidator(1);
        accounts.AnonymousAccountValidator(2);
        accounts.AnonymousAccountValidator(3);
        accounts.AnonymousAccountValidator(4);
        accounts.AnonymousAccountValidator(50);

        System.out.println("\n<---- Anonymous Method Ends ---->");
        System.out.println();

        //Adding access modifiers (Getters and setter Encapsulation)
        System.out.println("\n<---- Start of getters and setters ---->");
        System.out.println();

        Account accList = new Account();
        accList.AddAccount(new Account(1,300));
        accList.AddAccount(new Account(2,400));
        accList.AddAccount(new Account(3,500));

        accList.GetAllAccounts();

        System.out.println("\n<---- End of getters and setters ---->");
        System.out.println();

    }
}
