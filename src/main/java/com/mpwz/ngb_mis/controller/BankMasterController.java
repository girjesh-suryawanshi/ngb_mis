package com.mpwz.ngb_mis.controller;

import com.mpwz.ngb_mis.interfaces.BankMasterInterface;
import com.mpwz.ngb_mis.services.BankMasterService;
import com.mpwz.ngb_mis.utility.GlobalResources;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value ="/bank" )
public class BankMasterController {
   private Logger logger = GlobalResources.getLogger(BankMasterController.class);

    @Autowired
    BankMasterService bankMasterService;

    @RequestMapping(method = RequestMethod.GET,produces ="application/json")
    public ResponseEntity<?>getAll(){
        String methodName = "getAll() : ";
        logger.info(methodName +"called");
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

    @RequestMapping(method =RequestMethod.POST,consumes = "application/json")
    public ResponseEntity<?>postBankMaster(@RequestBody BankMasterInterface bankMasterInterface){
        String methodName = "postBankMaster() ";
        logger.info(methodName + "called");
        ResponseEntity<?>response = null;
        BankMasterInterface bankMasterInterface1 = null;
        if(bankMasterInterface != null){
            bankMasterInterface1 = bankMasterService.insert(bankMasterInterface);

            if(bankMasterInterface1!= null){
                response = new ResponseEntity<>(bankMasterInterface1,HttpStatus.CREATED);
            }else{
                response =new ResponseEntity<>("Unable to insert bankMaster",HttpStatus.EXPECTATION_FAILED);
            }

        }else{
            response = new ResponseEntity<>("Bank Master is null",HttpStatus.BAD_REQUEST);
        }

        return  response;


    }

}
