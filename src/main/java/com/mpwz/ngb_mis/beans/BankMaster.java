package com.mpwz.ngb_mis.beans;

import com.mpwz.ngb_mis.interfaces.BankMasterInterface;

import javax.persistence.*;

@Entity(name = "BankMaster")
@Table(name = "bank_master")
public class BankMaster implements BankMasterInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private long id;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "ifsc_code")
    private String ifscCode;

    @Column(name = "address")
    private String address;

    public BankMaster() {
    }

    public BankMaster(long id, String bankName, String ifscCode, String address) {
        this.id = id;
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "BankMaster{" +
                "id=" + id +
                ", bankName='" + bankName + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
