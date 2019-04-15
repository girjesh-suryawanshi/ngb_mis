package com.mpwz.ngb_mis.dao;

import com.mpwz.ngb_mis.interfaces.BankMasterInterface;
import com.mpwz.ngb_mis.repository.BankMasterRepository;
import com.mpwz.ngb_mis.utility.GlobalResources;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankMasterDAO {

    private Logger logger = GlobalResources.getLogger(BankMasterDAO.class);

    @Autowired
    BankMasterRepository bankMasterRepository;

    public List<? extends BankMasterInterface> getAll(){

       List<? extends BankMasterInterface>bankMasterInterfaces =  bankMasterRepository.findAll();

       return bankMasterInterfaces;
    }

    /**
     * Get bank master interface and insert it
     * @param bankMasterInterface
     * @return
     */

   public BankMasterInterface insertBankMaster(BankMasterInterface bankMasterInterface){
        String methodName ="insertBankMaster() ";
        logger.info(methodName + "called");
        BankMasterInterface bankMasterInterface1 = null;
        if(bankMasterInterface != null){
            bankMasterInterface1 = bankMasterRepository.save(bankMasterInterface);
        }
        return  bankMasterInterface1;

   }
}
