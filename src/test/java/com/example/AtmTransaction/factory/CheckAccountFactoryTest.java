package com.example.AtmTransaction.factory;

import com.example.AtmTransaction.domain.account.CheckAccount;
import com.example.AtmTransaction.factory.account.CheckFactory;
import org.junit.Test;

public class CheckAccountFactoryTest {
    CheckAccount checkAccount = CheckFactory.getAmount( 345.0 );

    @Test
    public void getAmount() {
        System.out.println( checkAccount.toString());
    }
}