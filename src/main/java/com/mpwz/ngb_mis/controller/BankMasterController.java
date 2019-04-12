package com.mpwz.ngb_mis.controller;

import com.mpwz.ngb_mis.interfaces.BankMasterInterface;
import com.mpwz.ngb_mis.services.BankMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value ="/bank" )
public class BankMasterController {

    @Autowired
    BankMasterService bankMasterService;

    @RequestMapping(method = RequestMethod.GET,produces ="application/json")
    public ResponseEntity<?>getAll(){
        ResponseEntity<?> responseEntity = null;
        List<?extends BankMasterInterface> bankMasterInterfaces= null;

        bankMasterInterfaces = bankMasterService.getAll();

        if(bankMasterInterfaces !=null){

            if(bankMasterInterfaces.size()>0){
                responseEntity = new ResponseEntity<>(bankMasterInterfaces, HttpStatus.OK);
            }else{
                responseEntity = new ResponseEntity<>("No Content",HttpStatus.NO_CONTENT);

            }

        }

        return  responseEntity;
    }

}
