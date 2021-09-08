package main.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;

@Entity
@Table(name = "person", schema = "ECSC_SQL")
public class PersonEntity {
    private Integer pId;
    private Integer memberType;
    private String fName;
    private String lName;
    private Date birthday;
    private String occupation;
    private String buisness;
    private Boolean isActive;
    private byte[] picture;
    private String nickName;
    private MembershipEntity membershipByMsId;

    @Id
    @Column(name = "P_ID")
    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    @Basic
    @Column(name = "MEMBER_TYPE")
    public Integer getMemberType() {
        return memberType;
    }

    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }

    @Basic
    @Column(name = "F_NAME")
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Basic
    @Column(name = "L_NAME")
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Basic
    @Column(name = "BIRTHDAY")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "OCCUPATION")
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Basic
    @Column(name = "BUISNESS")
    public String getBuisness() {
        return buisness;
    }

    public void setBuisness(String buisness) {
        this.buisness = buisness;
    }

    @Basic
    @Column(name = "IS_ACTIVE")
    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    //@Basic
    @Column(name = "PICTURE",columnDefinition="blob")
    public byte[]getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "NICK_NAME")
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonEntity that = (PersonEntity) o;

        if (pId != that.pId) return false;
        if (memberType != null ? !memberType.equals(that.memberType) : that.memberType != null) return false;
        if (fName != null ? !fName.equals(that.fName) : that.fName != null) return false;
        if (lName != null ? !lName.equals(that.lName) : that.lName != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (occupation != null ? !occupation.equals(that.occupation) : that.occupation != null) return false;
        if (buisness != null ? !buisness.equals(that.buisness) : that.buisness != null) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        if (!Arrays.equals(picture, that.picture)) return false;
        if (nickName != null ? !nickName.equals(that.nickName) : that.nickName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        Integer result = pId;
        result = 31 * result + (memberType != null ? memberType.hashCode() : 0);
        result = 31 * result + (fName != null ? fName.hashCode() : 0);
        result = 31 * result + (lName != null ? lName.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (occupation != null ? occupation.hashCode() : 0);
        result = 31 * result + (buisness != null ? buisness.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(picture);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        return result;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MS_ID", referencedColumnName = "MS_ID")
    public MembershipEntity getMembershipByMsId() {
        return membershipByMsId;
    }

    public void setMembershipByMsId(MembershipEntity membershipByMsId) {
        this.membershipByMsId = membershipByMsId;
    }
}
