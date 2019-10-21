package com.example.AtmTransaction.repository.account;

import com.example.AtmTransaction.domain.account.Fixed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FixedRepository extends JpaRepository< Fixed,String> {

}
