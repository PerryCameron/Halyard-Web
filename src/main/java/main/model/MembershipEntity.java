package main.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "membership", schema = "ECSC_SQL")
public class MembershipEntity {
    private int msId;
    private int pId;
    private Date joinDate;
    private String memType;
    private String address;
    private String city;
    private String state;
    private String zip;
    private Collection<PersonEntity> personByPId;

    @Id
    @Column(name = "MS_ID")
    public int getMsId() {
        return msId;
    }

    public void setMsId(int msId) {
        this.msId = msId;
    }

    @Basic
    @Column(name = "P_ID")
    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    @Basic
    @Column(name = "JOIN_DATE")
    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    @Basic
    @Column(name = "MEM_TYPE")
    public String getMemType() {
        return memType;
    }

    public void setMemType(String memType) {
        this.memType = memType;
    }

    @Basic
    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "STATE")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "ZIP")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MembershipEntity that = (MembershipEntity) o;

        if (msId != that.msId) return false;
        if (pId != that.pId) return false;
        if (!Objects.equals(joinDate, that.joinDate)) return false;
        if (memType != null ? !memType.equals(that.memType) : that.memType != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        return zip != null ? zip.equals(that.zip) : that.zip == null;
    }

    @Override
    public int hashCode() {
        int result = msId;
        result = 31 * result + pId;
        result = 31 * result + (joinDate != null ? joinDate.hashCode() : 0);
        result = 31 * result + (memType != null ? memType.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zip != null ? zip.hashCode() : 0);
        return result;
    }



    @OneToMany(mappedBy = "membershipByMsId", fetch = FetchType.LAZY)
    public Collection<PersonEntity> getPersonByPId() {
        return personByPId;
    }

    public void setPersonByPId(Collection<PersonEntity> personByPId) {
        this.personByPId = personByPId;
    }
}
