package main.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "memo", schema = "ECSC_SQL", catalog = "")
public class MemoEntity {
    private int memoId;
    private Date memoDate;
    private String memo;
    private Integer moneyId;
    private String category;
    private MembershipEntity membershipByMsId;

    @Id
    @Column(name = "MEMO_ID")
    public int getMemoId() {
        return memoId;
    }

    public void setMemoId(int memoId) {
        this.memoId = memoId;
    }

    @Basic
    @Column(name = "MEMO_DATE")
    public Date getMemoDate() {
        return memoDate;
    }

    public void setMemoDate(Date memoDate) {
        this.memoDate = memoDate;
    }

    @Basic
    @Column(name = "MEMO")
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Basic
    @Column(name = "MONEY_ID")
    public Integer getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(Integer moneyId) {
        this.moneyId = moneyId;
    }

    @Basic
    @Column(name = "CATEGORY")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MemoEntity that = (MemoEntity) o;

        if (memoId != that.memoId) return false;
        if (memoDate != null ? !memoDate.equals(that.memoDate) : that.memoDate != null) return false;
        if (memo != null ? !memo.equals(that.memo) : that.memo != null) return false;
        if (moneyId != null ? !moneyId.equals(that.moneyId) : that.moneyId != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = memoId;
        result = 31 * result + (memoDate != null ? memoDate.hashCode() : 0);
        result = 31 * result + (memo != null ? memo.hashCode() : 0);
        result = 31 * result + (moneyId != null ? moneyId.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "MS_ID", referencedColumnName = "MS_ID", nullable = false)
    public MembershipEntity getMembershipByMsId() {
        return membershipByMsId;
    }

    public void setMembershipByMsId(MembershipEntity membershipByMsId) {
        this.membershipByMsId = membershipByMsId;
    }
}
