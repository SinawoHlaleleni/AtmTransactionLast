package com.example.AtmTransaction.factory.account;


import com.example.AtmTransaction.domain.account.CheckAccount;
import com.example.AtmTransaction.util.Misc;

public class CheckFactory {

    public static CheckAccount getAmount(double amount) {
        return new CheckAccount.Builder()
                .amount(amount)
                .Id( Misc.generateId())
                .build();
    }
}
