package main.model;

import javax.persistence.*;

@Entity
@Table(name = "email", schema = "ECSC_SQL")
public class EmailEntity {
    private int emailId;
    private Boolean primaryUse;
    private String email;
    private Boolean emailListed;
    private PersonEntity personByPId;

    @Id
    @Column(name = "EMAIL_ID")
    public int getEmailId() {
        return emailId;
    }

    public void setEmailId(int emailId) {
        this.emailId = emailId;
    }

    @Basic
    @Column(name = "PRIMARY_USE")
    public Boolean getPrimaryUse() {
        return primaryUse;
    }

    public void setPrimaryUse(Boolean primaryUse) {
        this.primaryUse = primaryUse;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "EMAIL_LISTED")
    public Boolean getEmailListed() {
        return emailListed;
    }

    public void setEmailListed(Boolean emailListed) {
        this.emailListed = emailListed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailEntity that = (EmailEntity) o;

        if (emailId != that.emailId) return false;
        if (primaryUse != null ? !primaryUse.equals(that.primaryUse) : that.primaryUse != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (emailListed != null ? !emailListed.equals(that.emailListed) : that.emailListed != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = emailId;
        result = 31 * result + (primaryUse != null ? primaryUse.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (emailListed != null ? emailListed.hashCode() : 0);
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
