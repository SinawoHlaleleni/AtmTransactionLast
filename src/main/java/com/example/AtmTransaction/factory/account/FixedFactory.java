package com.example.AtmTransaction.factory.account;

import com.example.AtmTransaction.domain.account.Fixed;
import com.example.AtmTransaction.util.Misc;

public class FixedFactory {

    public static Fixed getAmount(double amount) {
        return new Fixed.Builder()
                .amount(amount)
                .Id( Misc.generateId())
                .build();
    }
}

