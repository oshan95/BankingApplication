package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Account {

    //Encapsulation level - Getters and setters (use of access modifiers for instance and static variables)

    private int AccountNo;
    private BigDecimal balance;
    private List<Account> accounts;

    public Account(){
        accounts = new ArrayList<>();
    }

    public Account(int accNo, double amount){
        AccountNo = accNo;
        balance = BigDecimal.valueOf(amount);
    }

    @Override
    public String toString() {
        return "Account no: "+ AccountNo +","+" Balance : " +balance;
    }

    public void AddAccount(Account acc)
    {
        accounts.add(acc);
    }

    public void GetAllAccounts(){
        for(Account acc:accounts){
            System.out.println(acc.toString());
        }
    }




}
