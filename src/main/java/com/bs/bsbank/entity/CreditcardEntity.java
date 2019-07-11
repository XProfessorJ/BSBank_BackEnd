package com.bs.bsbank.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by hadoop on 2019/7/10.
 */
@Entity
@Table(name = "creditcard", schema = "bank", catalog = "")
public class CreditcardEntity {
    private String cardId;
    private String productName;
    private String productCode;
    private String cardNickname;
    private String displayAccountNumber;
    private String currencyCode;
    private String cardClassification;
    private String cardStatus;
    private Double requestedCreditLimitAmount;
    private Timestamp creditLimitIncreaseStartDate;
    private Timestamp creditLimitIncreaseEndDate;
    private String reasonCode;

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
    @Column(name = "requestedCreditLimitAmount")
    public Double getRequestedCreditLimitAmount() {
        return requestedCreditLimitAmount;
    }

    public void setRequestedCreditLimitAmount(Double requestedCreditLimitAmount) {
        this.requestedCreditLimitAmount = requestedCreditLimitAmount;
    }

    @Basic
    @Column(name = "creditLimitIncreaseStartDate")
    public Timestamp getCreditLimitIncreaseStartDate() {
        return creditLimitIncreaseStartDate;
    }

    public void setCreditLimitIncreaseStartDate(Timestamp creditLimitIncreaseStartDate) {
        this.creditLimitIncreaseStartDate = creditLimitIncreaseStartDate;
    }

    @Basic
    @Column(name = "creditLimitIncreaseEndDate")
    public Timestamp getCreditLimitIncreaseEndDate() {
        return creditLimitIncreaseEndDate;
    }

    public void setCreditLimitIncreaseEndDate(Timestamp creditLimitIncreaseEndDate) {
        this.creditLimitIncreaseEndDate = creditLimitIncreaseEndDate;
    }

    @Basic
    @Column(name = "reasonCode")
    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditcardEntity that = (CreditcardEntity) o;

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
        if (requestedCreditLimitAmount != null ? !requestedCreditLimitAmount.equals(that.requestedCreditLimitAmount) : that.requestedCreditLimitAmount != null)
            return false;
        if (creditLimitIncreaseStartDate != null ? !creditLimitIncreaseStartDate.equals(that.creditLimitIncreaseStartDate) : that.creditLimitIncreaseStartDate != null)
            return false;
        if (creditLimitIncreaseEndDate != null ? !creditLimitIncreaseEndDate.equals(that.creditLimitIncreaseEndDate) : that.creditLimitIncreaseEndDate != null)
            return false;
        if (reasonCode != null ? !reasonCode.equals(that.reasonCode) : that.reasonCode != null) return false;

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
        result = 31 * result + (requestedCreditLimitAmount != null ? requestedCreditLimitAmount.hashCode() : 0);
        result = 31 * result + (creditLimitIncreaseStartDate != null ? creditLimitIncreaseStartDate.hashCode() : 0);
        result = 31 * result + (creditLimitIncreaseEndDate != null ? creditLimitIncreaseEndDate.hashCode() : 0);
        result = 31 * result + (reasonCode != null ? reasonCode.hashCode() : 0);
        return result;
    }
}
