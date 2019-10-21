//package com.example.AtmTransaction.service.check.Impl;
//
//import com.example.AtmTransaction.domain.account.CheckAccount;
//import com.example.AtmTransaction.repository.account.CheckRepository;
//import com.example.AtmTransaction.service.check.CheckserviceInt;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class CheckService implements CheckserviceInt {
//    @Autowired
//    CheckRepository checkRepository;
//    @Override
//    public CheckAccount create(CheckAccount checkAccount) {
//        return checkRepository.save( checkAccount );
//    }
//
//    @Override
//    public CheckAccount read(String id) {
//        Optional< CheckAccount > result=checkRepository.findById( id );
//        return result.orElse( null );
//    }
//
//    @Override
//    public void delete(String id) {
//        checkRepository.deleteById( id );
//    }
//
//    @Override
//    public CheckAccount update(CheckAccount checkAccount) {
//        return checkRepository.save( checkAccount );
//    }
//
//    @Override
//    public List< CheckAccount > readAll() {
//        return checkRepository.findAll();
//    }
//}
