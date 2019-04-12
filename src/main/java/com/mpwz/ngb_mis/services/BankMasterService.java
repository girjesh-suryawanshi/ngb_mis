package com.mpwz.ngb_mis.services;

import com.mpwz.ngb_mis.dao.BankMasterDAO;
import com.mpwz.ngb_mis.interfaces.BankMasterInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankMasterService {

    @Autowired
    BankMasterDAO bankMasterDAO;

    public List<? extends BankMasterInterface> getAll() {
        System.out.println("Inside Bank master Service");

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

}
