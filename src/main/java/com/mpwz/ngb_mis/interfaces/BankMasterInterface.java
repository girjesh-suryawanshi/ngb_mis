package com.mpwz.ngb_mis.interfaces;

public interface BankMasterInterface extends BeanInterface {
    public long getId();

    public void setId(long id);

    public String getBankName();

    public void setBankName(String bankName);

    public String getIfscCode();

    public void setIfscCode(String ifscCode);

    public String getAddress();

    public void setAddress(String address);


}

