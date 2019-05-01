package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Accounts {

    private List<Account> accounts;

    {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account acc)
    {
        accounts.add(acc);
    }

    public void getAccounts(){
        for(Account acc:accounts){
            System.out.println(acc.toString());
        }
    }

    public void Credit(int AccNo, double amount)
    {
        BigDecimal oldBal = accounts.get(AccNo-1).balance;
        BigDecimal newBal = oldBal.add(BigDecimal.valueOf(amount));
        accounts.get(AccNo-1).balance = newBal;

    }

    public void Debit(int AccNo, double amount)
    {
        BigDecimal oldBal = accounts.get(AccNo-1).balance;
        BigDecimal newBal = oldBal.subtract(BigDecimal.valueOf(amount));

        if(newBal.compareTo(BigDecimal.valueOf(0))<0){
            System.out.println("Cannot deduct the amount : "+amount+", because of insufficient balance in account : "+AccNo);
        }
        else {
            accounts.get(AccNo-1).balance = newBal;
        }

    }

    //Encapsulation level - Inner method
    public void AccountValidator(int accNum) {
        class Validator {
            public void validate(int an) {
                if (an-1 >= accounts.size()) {
                    System.out.println("Their is no account under "+an+" account number");
                } else {
                    System.out.println("The account under " +an+ " account number exists!");
                }
            }
        }
        new Validator().validate(accNum);
    }

    //Encapsulation level - Anonymous class (
    public void AnonymousAccountValidator(int num) {
        new Object() {
            public void validate(int number) {
                if (number-1 >= accounts.size()) {
                    System.out.println("Their is no account under "+number+" account number");
                } else {
                    System.out.println("The account under " +number+ " account number exists!");
                }
            }
        }.validate(num);
    }

    //Encapsulation level : Inner class (A class inside another class)
    public class Account{

        int AccountNo;
        BigDecimal balance;

        public Account(int accountNo, double balance) {
            this.AccountNo = accountNo;
            this.balance =  BigDecimal.valueOf(balance);
        }

        @Override
        public String toString() {
            return "Account no: "+ AccountNo +","+" Balance : " +balance;
        }
    }


}
