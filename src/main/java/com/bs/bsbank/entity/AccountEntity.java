package com.bs.bsbank.entity;

import javax.persistence.*;

/**
 * Created by hadoop on 2019/7/10.
 */
@Entity
@Table(name = "account", schema = "bank", catalog = "")
public class AccountEntity {
    private String accountId;
    private String accountGroup;

    @Id
    @Column(name = "accountId")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "accountGroup")
    public String getAccountGroup() {
        return accountGroup;
    }

    public void setAccountGroup(String accountGroup) {
        this.accountGroup = accountGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountEntity that = (AccountEntity) o;

        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (accountGroup != null ? !accountGroup.equals(that.accountGroup) : that.accountGroup != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accountId != null ? accountId.hashCode() : 0;
        result = 31 * result + (accountGroup != null ? accountGroup.hashCode() : 0);
        return result;
    }
}
