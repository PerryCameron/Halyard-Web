package main.model;

import javax.persistence.*;

@Entity
@Table(name = "work_credit", schema = "ECSC_SQL", catalog = "")
public class WorkCreditEntity {
    private int moneyId;
    private int msId;
    private Integer racing;
    private Integer harbor;
    private Integer social;
    private Integer other;
    private MoneyEntity moneyByMoneyId;

    @Id
    @Column(name = "MONEY_ID")
    public int getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(int moneyId) {
        this.moneyId = moneyId;
    }

    @Basic
    @Column(name = "MS_ID")
    public int getMsId() {
        return msId;
    }

    public void setMsId(int msId) {
        this.msId = msId;
    }

    @Basic
    @Column(name = "RACING")
    public Integer getRacing() {
        return racing;
    }

    public void setRacing(Integer racing) {
        this.racing = racing;
    }

    @Basic
    @Column(name = "HARBOR")
    public Integer getHarbor() {
        return harbor;
    }

    public void setHarbor(Integer harbor) {
        this.harbor = harbor;
    }

    @Basic
    @Column(name = "SOCIAL")
    public Integer getSocial() {
        return social;
    }

    public void setSocial(Integer social) {
        this.social = social;
    }

    @Basic
    @Column(name = "OTHER")
    public Integer getOther() {
        return other;
    }

    public void setOther(Integer other) {
        this.other = other;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkCreditEntity that = (WorkCreditEntity) o;

        if (moneyId != that.moneyId) return false;
        if (msId != that.msId) return false;
        if (racing != null ? !racing.equals(that.racing) : that.racing != null) return false;
        if (harbor != null ? !harbor.equals(that.harbor) : that.harbor != null) return false;
        if (social != null ? !social.equals(that.social) : that.social != null) return false;
        if (other != null ? !other.equals(that.other) : that.other != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moneyId;
        result = 31 * result + msId;
        result = 31 * result + (racing != null ? racing.hashCode() : 0);
        result = 31 * result + (harbor != null ? harbor.hashCode() : 0);
        result = 31 * result + (social != null ? social.hashCode() : 0);
        result = 31 * result + (other != null ? other.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "MONEY_ID", referencedColumnName = "MONEY_ID", nullable = false)
    public MoneyEntity getMoneyByMoneyId() {
        return moneyByMoneyId;
    }

    public void setMoneyByMoneyId(MoneyEntity moneyByMoneyId) {
        this.moneyByMoneyId = moneyByMoneyId;
    }
}
