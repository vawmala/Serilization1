package com.company;


import java.io.Serializable;

public class CreditCard implements Serializable {

    private String bankName;
    private  long cardNumber;
    private transient String exp;
    private transient Integer cvv;
    Enum cardType;

    public CreditCard(Enum cardType, String bankName, long cardNumber, String exp, Integer cvv) {
        this.cardType = cardType;
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.exp = exp;
        this.cvv = cvv;
    }

      public Enum getCardType() {
        return cardType;
    }

    public void setCardType(Enum cardType) {
        this.cardType = cardType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardType=" + cardType +
                ", bankName='" + bankName + '\'' +
                ", cardNumber=" + cardNumber +
                ", exp='" + exp + '\'' +
                ", cvv=" + cvv +
                '}';
    }
}
