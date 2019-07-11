package com.bs.bsbank.entity;

import javax.persistence.*;

/**
 * Created by hadoop on 2019/7/10.
 */
@Entity
@Table(name = "savingcard", schema = "bank", catalog = "")
public class SavingcardEntity {
    private String cardId;
    private String productName;
    private String productCode;
    private String cardNickname;
    private String displayAccountNumber;
    private String currencyCode;
    private String cardClassification;
    private String cardStatus;
    private Double currentBalance;
    private Double availableBalance;

    @Id
    @Column(name = "cardId")
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Basic
    @Column(name = "productName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "productCode")
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Basic
    @Column(name = "cardNickname")
    public String getCardNickname() {
        return cardNickname;
    }

    public void setCardNickname(String cardNickname) {
        this.cardNickname = cardNickname;
    }

    @Basic
    @Column(name = "displayAccountNumber")
    public String getDisplayAccountNumber() {
        return displayAccountNumber;
    }

    public void setDisplayAccountNumber(String displayAccountNumber) {
        this.displayAccountNumber = displayAccountNumber;
    }

    @Basic
    @Column(name = "currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Basic
    @Column(name = "cardClassification")
    public String getCardClassification() {
        return cardClassification;
    }

    public void setCardClassification(String cardClassification) {
        this.cardClassification = cardClassification;
    }

    @Basic
    @Column(name = "cardStatus")
    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    @Basic
    @Column(name = "currentBalance")
    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Basic
    @Column(name = "availableBalance")
    public Double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SavingcardEntity that = (SavingcardEntity) o;

        if (cardId != null ? !cardId.equals(that.cardId) : that.cardId != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (productCode != null ? !productCode.equals(that.productCode) : that.productCode != null) return false;
        if (cardNickname != null ? !cardNickname.equals(that.cardNickname) : that.cardNickname != null) return false;
        if (displayAccountNumber != null ? !displayAccountNumber.equals(that.displayAccountNumber) : that.displayAccountNumber != null)
            return false;
        if (currencyCode != null ? !currencyCode.equals(that.currencyCode) : that.currencyCode != null) return false;
        if (cardClassification != null ? !cardClassification.equals(that.cardClassification) : that.cardClassification != null)
            return false;
        if (cardStatus != null ? !cardStatus.equals(that.cardStatus) : that.cardStatus != null) return false;
        if (currentBalance != null ? !currentBalance.equals(that.currentBalance) : that.currentBalance != null)
            return false;
        if (availableBalance != null ? !availableBalance.equals(that.availableBalance) : that.availableBalance != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cardId != null ? cardId.hashCode() : 0;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productCode != null ? productCode.hashCode() : 0);
        result = 31 * result + (cardNickname != null ? cardNickname.hashCode() : 0);
        result = 31 * result + (displayAccountNumber != null ? displayAccountNumber.hashCode() : 0);
        result = 31 * result + (currencyCode != null ? currencyCode.hashCode() : 0);
        result = 31 * result + (cardClassification != null ? cardClassification.hashCode() : 0);
        result = 31 * result + (cardStatus != null ? cardStatus.hashCode() : 0);
        result = 31 * result + (currentBalance != null ? currentBalance.hashCode() : 0);
        result = 31 * result + (availableBalance != null ? availableBalance.hashCode() : 0);
        return result;
    }
}
