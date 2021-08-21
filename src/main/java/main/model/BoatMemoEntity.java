package main.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "boat_memo", schema = "ECSC_SQL", catalog = "")
public class BoatMemoEntity {
    private int boatMemoId;
    private Date memoDate;
    private String memo;
    private BoatEntity boatByBoatId;

    @Id
    @Column(name = "BOAT_MEMO_ID")
    public int getBoatMemoId() {
        return boatMemoId;
    }

    public void setBoatMemoId(int boatMemoId) {
        this.boatMemoId = boatMemoId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoatMemoEntity that = (BoatMemoEntity) o;

        if (boatMemoId != that.boatMemoId) return false;
        if (memoDate != null ? !memoDate.equals(that.memoDate) : that.memoDate != null) return false;
        if (memo != null ? !memo.equals(that.memo) : that.memo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = boatMemoId;
        result = 31 * result + (memoDate != null ? memoDate.hashCode() : 0);
        result = 31 * result + (memo != null ? memo.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "BOAT_ID", referencedColumnName = "BOAT_ID", nullable = false)
    public BoatEntity getBoatByBoatId() {
        return boatByBoatId;
    }

    public void setBoatByBoatId(BoatEntity boatByBoatId) {
        this.boatByBoatId = boatByBoatId;
    }
}
