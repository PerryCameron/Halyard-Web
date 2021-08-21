package main.model;

import javax.persistence.*;

@Entity
@Table(name = "phone", schema = "ECSC_SQL", catalog = "")
public class PhoneEntity {
    private int phoneId;
    private String phone;
    private String phoneType;
    private Boolean phoneListed;
    private PersonEntity personByPId;

    @Id
    @Column(name = "PHONE_ID")
    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    @Basic
    @Column(name = "PHONE")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "PHONE_TYPE")
    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    @Basic
    @Column(name = "PHONE_LISTED")
    public Boolean getPhoneListed() {
        return phoneListed;
    }

    public void setPhoneListed(Boolean phoneListed) {
        this.phoneListed = phoneListed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneEntity that = (PhoneEntity) o;

        if (phoneId != that.phoneId) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (phoneType != null ? !phoneType.equals(that.phoneType) : that.phoneType != null) return false;
        if (phoneListed != null ? !phoneListed.equals(that.phoneListed) : that.phoneListed != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = phoneId;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (phoneType != null ? phoneType.hashCode() : 0);
        result = 31 * result + (phoneListed != null ? phoneListed.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "P_ID", referencedColumnName = "P_ID", nullable = false)
    public PersonEntity getPersonByPId() {
        return personByPId;
    }

    public void setPersonByPId(PersonEntity personByPId) {
        this.personByPId = personByPId;
    }
}
