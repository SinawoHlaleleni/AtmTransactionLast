package com.example.AtmTransaction.repository.account;

import com.example.AtmTransaction.domain.account.CheckAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckRepository extends JpaRepository< CheckAccount,String> {
}
