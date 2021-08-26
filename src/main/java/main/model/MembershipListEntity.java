package main.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "membership", schema = "ECSC_SQL")
@SecondaryTable(name="membership_id", pkJoinColumns = @PrimaryKeyJoinColumn(name = "MS_ID", referencedColumnName = "MS_ID"))
@SecondaryTable(name="person", pkJoinColumns = @PrimaryKeyJoinColumn(name= "MS_ID", referencedColumnName = "MS_ID"))
public class MembershipListEntity {
    private Integer msId;
    private Integer pId;
    private Date joinDate;
//    private String memType;
    private String address;
    private String city;
    private String state;
    private String zip;
    private Integer memberType;
    private String fName;
    private String lName;
    private Date birthday;
    private String occupation;
    private String buisness;
    private Boolean isActive;
    private byte[] picture;
    private String nickName;
    private Integer mid;
    private Integer fiscalYear;
    private Integer membershipId;
    private Boolean renew;
    private String memType;
    private Boolean selected;
    private Boolean lateRenew;


    @Id
    @Column(name = "MS_ID", nullable = false)
    public int getMsId() {
        return msId;
    }

    public void setMsId(int id) {
        this.msId = id;
    }

    @Column(name = "P_ID")
    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    @Column(name = "JOIN_DATE")
    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

//    @Column(name = "MEM_TYPE")
//    public String getMemType() {
//        return memType;
//    }
//
//    public void setMemType(String memType) {
//        this.memType = memType;
//    }

    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "STATE")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name = "ZIP")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Column(name = "MEMBER_TYPE", table = "person")
    public Integer getMemberType() {
        return memberType;
    }

    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }

    @Column(name = "F_NAME", table = "person")
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Column(name = "L_NAME", table = "person")
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Column(name = "BIRTHDAY", table = "person")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Column(name = "OCCUPATION", table = "person")
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Column(name = "BUISNESS", table = "person")
    public String getBuisness() {
        return buisness;
    }

    public void setBuisness(String buisness) {
        this.buisness = buisness;
    }

    @Basic
    @Column(name = "IS_ACTIVE", table = "person")
    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    //@Basic
    @Column(name = "PICTURE",columnDefinition="blob", table = "person")
    public byte[]getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "NICK_NAME", table = "person")
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Column(name = "MID", table = "membership_id")
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Column(name = "FISCAL_YEAR", table = "membership_id")
    public Integer getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(int fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    @Column(name = "MEMBERSHIP_ID", table = "membership_id")
    public Integer getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Integer membershipId) {
        this.membershipId = membershipId;
    }

    @Column(name = "RENEW", table = "membership_id")
    public Boolean getRenew() {
        return renew;
    }

    public void setRenew(Boolean renew) {
        this.renew = renew;
    }

    @Column(name = "MEM_TYPE", table = "membership_id")
    public String getMemType() {
        return memType;
    }

    public void setMemType(String memType) {
        this.memType = memType;
    }

    @Column(name = "SELECTED", table = "membership_id")
    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    @Column(name = "LATE_RENEW", table = "membership_id")
    public Boolean getLateRenew() {
        return lateRenew;
    }

    public void setLateRenew(Boolean lateRenew) {
        this.lateRenew = lateRenew;
    }

}
