package main.model;

import javax.persistence.*;

@Entity
@Table(name = "winter_storage", schema = "ECSC_SQL", catalog = "")
public class WinterStorageEntity {
    private int wsId;
    private int fiscalYear;
    private BoatEntity boatByBoatId;

    @Id
    @Column(name = "WS_ID")
    public int getWsId() {
        return wsId;
    }

    public void setWsId(int wsId) {
        this.wsId = wsId;
    }

    @Basic
    @Column(name = "FISCAL_YEAR")
    public int getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(int fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WinterStorageEntity that = (WinterStorageEntity) o;

        if (wsId != that.wsId) return false;
        if (fiscalYear != that.fiscalYear) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wsId;
        result = 31 * result + fiscalYear;
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
