package com.bs.bsbank.entity;

import javax.persistence.*;

/**
 * Created by hadoop on 2019/7/10.
 */
@Entity
@Table(name = "customer", schema = "bank", catalog = "")
public class CustomerEntity {
    private String customerId;
    private String customerType;
    private String names;
    private String gender;
    private String prefix;
    private String suffix;
    private String customerSegment;
    private String partnerCustomerSegment;
    private String password;

    @Id
    @Column(name = "customerId")
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "customerType")
    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Basic
    @Column(name = "names")
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "prefix")
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Basic
    @Column(name = "suffix")
    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Basic
    @Column(name = "customerSegment")
    public String getCustomerSegment() {
        return customerSegment;
    }

    public void setCustomerSegment(String customerSegment) {
        this.customerSegment = customerSegment;
    }

    @Basic
    @Column(name = "partnerCustomerSegment")
    public String getPartnerCustomerSegment() {
        return partnerCustomerSegment;
    }

    public void setPartnerCustomerSegment(String partnerCustomerSegment) {
        this.partnerCustomerSegment = partnerCustomerSegment;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerEntity that = (CustomerEntity) o;

        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (customerType != null ? !customerType.equals(that.customerType) : that.customerType != null) return false;
        if (names != null ? !names.equals(that.names) : that.names != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (prefix != null ? !prefix.equals(that.prefix) : that.prefix != null) return false;
        if (suffix != null ? !suffix.equals(that.suffix) : that.suffix != null) return false;
        if (customerSegment != null ? !customerSegment.equals(that.customerSegment) : that.customerSegment != null)
            return false;
        if (partnerCustomerSegment != null ? !partnerCustomerSegment.equals(that.partnerCustomerSegment) : that.partnerCustomerSegment != null)
            return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId != null ? customerId.hashCode() : 0;
        result = 31 * result + (customerType != null ? customerType.hashCode() : 0);
        result = 31 * result + (names != null ? names.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (prefix != null ? prefix.hashCode() : 0);
        result = 31 * result + (suffix != null ? suffix.hashCode() : 0);
        result = 31 * result + (customerSegment != null ? customerSegment.hashCode() : 0);
        result = 31 * result + (partnerCustomerSegment != null ? partnerCustomerSegment.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
