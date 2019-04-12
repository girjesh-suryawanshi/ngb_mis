package com.mpwz.ngb_mis.dao;

import com.mpwz.ngb_mis.interfaces.BankMasterInterface;
import com.mpwz.ngb_mis.repository.BankMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankMasterDAO {

    @Autowired
    BankMasterRepository bankMasterRepository;

    public List<? extends BankMasterInterface> getAll(){

       List<? extends BankMasterInterface>bankMasterInterfaces =  bankMasterRepository.findAll();

       return bankMasterInterfaces;
    }
}
