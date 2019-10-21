package com.example.AtmTransaction.controller.account;

import com.example.AtmTransaction.domain.account.CheckAccount;
import com.example.AtmTransaction.repository.account.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/atm/check")
public class CheckController {

@Autowired
private CheckRepository checkRepository;

@GetMapping(value = "/all")
    public List< CheckAccount > getAll(){
    return checkRepository.findAll();
}
    @PostMapping(value = "/load")
    public List<CheckAccount>persist(@RequestBody final  CheckAccount checkAccount){
    checkRepository.save(checkAccount);
        return checkRepository.findAll();
    }
//
//    @GetMapping(value = "/read")
//     public CheckAccount read(@RequestParam("id") String id){
//    return checkRepository( id );
//}


@DeleteMapping(value = "/delete/{id}")
public List<CheckAccount> detele(@PathVariable String id){
    checkRepository.deleteById( id );
 return checkRepository.findAll();
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

