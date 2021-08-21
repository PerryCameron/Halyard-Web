package main.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "payment", schema = "ECSC_SQL", catalog = "")
public class PaymentEntity {
    private int payId;
    private String checknumber;
    private String paymentType;
    private Date paymentDate;
    private int amount;
    private MoneyEntity moneyByMoneyId;
    private DepositEntity depositByDepositId;

    @Id
    @Column(name = "PAY_ID")
    public int getPayId() {
        return payId;
    }

    public void setPayId(int payId) {
        this.payId = payId;
    }

    @Basic
    @Column(name = "CHECKNUMBER")
    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber;
    }

    @Basic
    @Column(name = "PAYMENT_TYPE")
    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Basic
    @Column(name = "PAYMENT_DATE")
    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Basic
    @Column(name = "AMOUNT")
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaymentEntity that = (PaymentEntity) o;

        if (payId != that.payId) return false;
        if (amount != that.amount) return false;
        if (checknumber != null ? !checknumber.equals(that.checknumber) : that.checknumber != null) return false;
        if (paymentType != null ? !paymentType.equals(that.paymentType) : that.paymentType != null) return false;
        if (paymentDate != null ? !paymentDate.equals(that.paymentDate) : that.paymentDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = payId;
        result = 31 * result + (checknumber != null ? checknumber.hashCode() : 0);
        result = 31 * result + (paymentType != null ? paymentType.hashCode() : 0);
        result = 31 * result + (paymentDate != null ? paymentDate.hashCode() : 0);
        result = 31 * result + amount;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "MONEY_ID", referencedColumnName = "MONEY_ID", nullable = false)
    public MoneyEntity getMoneyByMoneyId() {
        return moneyByMoneyId;
    }

    public void setMoneyByMoneyId(MoneyEntity moneyByMoneyId) {
        this.moneyByMoneyId = moneyByMoneyId;
    }

    @ManyToOne
    @JoinColumn(name = "DEPOSIT_ID", referencedColumnName = "DEPOSIT_ID", nullable = false)
    public DepositEntity getDepositByDepositId() {
        return depositByDepositId;
    }

    public void setDepositByDepositId(DepositEntity depositByDepositId) {
        this.depositByDepositId = depositByDepositId;
    }
}
