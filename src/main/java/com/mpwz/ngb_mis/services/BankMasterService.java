package com.mpwz.ngb_mis.services;

import com.mpwz.ngb_mis.dao.BankMasterDAO;
import com.mpwz.ngb_mis.interfaces.BankMasterInterface;
import com.mpwz.ngb_mis.utility.GlobalResources;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankMasterService {

    private Logger logger = GlobalResources.getLogger(BankMasterService.class);

    @Autowired
    BankMasterDAO bankMasterDAO;

    public List<? extends BankMasterInterface> getAll() {
        String methodName = "getAll()  :";
        logger.error(methodName + "Called");

        List<? extends BankMasterInterface> bankMasterInterfaces = null;

        bankMasterInterfaces = bankMasterDAO.getAll();

        if (bankMasterInterfaces != null) {
            if (bankMasterInterfaces.size() > 0) {
                return bankMasterInterfaces;
            } else {
                System.out.println("Error");
            }
        }
        return bankMasterInterfaces;

    }

    public BankMasterInterface insert(BankMasterInterface bankMasterInterface) {
        String methodName = "insert() ";
        logger.info(methodName + "called");
        BankMasterInterface bankMasterInterface1 = null;
        if (bankMasterInterface != null) {
            bankMasterInterface1 = bankMasterDAO.insertBankMaster(bankMasterInterface);

        }
        return bankMasterInterface1;
    }

}
