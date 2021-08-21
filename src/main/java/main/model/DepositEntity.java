package main.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@Table(name = "deposit", schema = "ECSC_SQL", catalog = "")
public class DepositEntity {
    private int depositId;
    private Date depositDate;
    private int fiscalYear;
    private int batch;

    @Id
    @Column(name = "DEPOSIT_ID")
    public int getDepositId() {
        return depositId;
    }

    public void setDepositId(int depositId) {
        this.depositId = depositId;
    }

    @Basic
    @Column(name = "DEPOSIT_DATE")
    public Date getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(Date depositDate) {
        this.depositDate = depositDate;
    }

    @Basic
    @Column(name = "FISCAL_YEAR")
    public int getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(int fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    @Basic
    @Column(name = "BATCH")
    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepositEntity that = (DepositEntity) o;

        if (depositId != that.depositId) return false;
        if (fiscalYear != that.fiscalYear) return false;
        if (depositDate != null ? !depositDate.equals(that.depositDate) : that.depositDate != null) return false;
        if (batch != that.batch) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = depositId;
        result = 31 * result + (depositDate != null ? depositDate.hashCode() : 0);
        result = 31 * result + fiscalYear;
        result = 31 * result + batch;
        return result;
    }
}
