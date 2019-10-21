package com.example.AtmTransaction.controller.account;

import com.example.AtmTransaction.domain.account.Fixed;
import com.example.AtmTransaction.repository.account.FixedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/atm/fixed")
public class FixedController {
    @Autowired
    private FixedRepository fixedRepository;

    @GetMapping(value = "/all")
    public List< Fixed > getAll(){
        return fixedRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<Fixed>persist(@RequestBody final  Fixed checkAccount){
        fixedRepository.save(checkAccount);
        return fixedRepository.findAll();
    }
//
//    @GetMapping(value = "/read")
//     public CheckAccount read(@RequestParam("id") String id){
//    return checkRepository( id );
//}


    @DeleteMapping(value = "/delete/{id}")
    public List<Fixed> detele(@PathVariable String id){
        fixedRepository.deleteById( id );
        return fixedRepository.findAll();
    }
//@PutMapping(value = "/update/{id}/{amount}")
//public @RequestBody CheckAccount update(@PathVariable String id, @PathVariable Double amount ){
//    CheckAccount checkAccount = this.checkRepository.getOne( id );
//        if (CheckAccount != null){
//            this.checkRepository.
//        }
//    return checkRepository.save( checkAccount );
//}

}


