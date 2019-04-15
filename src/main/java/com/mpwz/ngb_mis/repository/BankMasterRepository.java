package com.mpwz.ngb_mis.repository;

import com.mpwz.ngb_mis.beans.BankMaster;
import com.mpwz.ngb_mis.interfaces.BankMasterInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankMasterRepository extends JpaRepository<BankMaster, Long> {

    public BankMasterInterface save(BankMasterInterface bankMasterInterface);
}
