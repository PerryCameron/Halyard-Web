package main.model;

import javax.persistence.*;

@Entity
@Table(name = "boat", schema = "ECSC_SQL")
public class BoatEntity {
    private int boatId;
    private String manufacturer;
    private String manufactureYear;
    private String registrationNum;
    private String model;
    private String boatName;
    private String sailNumber;
    private Boolean hasTrailer;
    private String length;
    private String weight;
    private String keel;
    private Integer phrf;
    private String draft;
    private String beam;
    private String lwl;

    @Id
    @Column(name = "BOAT_ID")
    public int getBoatId() {
        return boatId;
    }

    public void setBoatId(int boatId) {
        this.boatId = boatId;
    }

    @Basic
    @Column(name = "MANUFACTURER")
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Basic
    @Column(name = "MANUFACTURE_YEAR")
    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    @Basic
    @Column(name = "REGISTRATION_NUM")
    public String getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }

    @Basic
    @Column(name = "MODEL")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "BOAT_NAME")
    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    @Basic
    @Column(name = "SAIL_NUMBER")
    public String getSailNumber() {
        return sailNumber;
    }

    public void setSailNumber(String sailNumber) {
        this.sailNumber = sailNumber;
    }

    @Basic
    @Column(name = "HAS_TRAILER")
    public Boolean getHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(Boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Basic
    @Column(name = "LENGTH")
    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Basic
    @Column(name = "WEIGHT")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "KEEL")
    public String getKeel() {
        return keel;
    }

    public void setKeel(String keel) {
        this.keel = keel;
    }

    @Basic
    @Column(name = "PHRF")
    public Integer getPhrf() {
        return phrf;
    }

    public void setPhrf(Integer phrf) {
        this.phrf = phrf;
    }

    @Basic
    @Column(name = "DRAFT")
    public String getDraft() {
        return draft;
    }

    public void setDraft(String draft) {
        this.draft = draft;
    }

    @Basic
    @Column(name = "BEAM")
    public String getBeam() {
        return beam;
    }

    public void setBeam(String beam) {
        this.beam = beam;
    }

    @Basic
    @Column(name = "LWL")
    public String getLwl() {
        return lwl;
    }

    public void setLwl(String lwl) {
        this.lwl = lwl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoatEntity that = (BoatEntity) o;

        if (boatId != that.boatId) return false;
        if (manufacturer != null ? !manufacturer.equals(that.manufacturer) : that.manufacturer != null) return false;
        if (manufactureYear != null ? !manufactureYear.equals(that.manufactureYear) : that.manufactureYear != null)
            return false;
        if (registrationNum != null ? !registrationNum.equals(that.registrationNum) : that.registrationNum != null)
            return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (boatName != null ? !boatName.equals(that.boatName) : that.boatName != null) return false;
        if (sailNumber != null ? !sailNumber.equals(that.sailNumber) : that.sailNumber != null) return false;
        if (hasTrailer != null ? !hasTrailer.equals(that.hasTrailer) : that.hasTrailer != null) return false;
        if (length != null ? !length.equals(that.length) : that.length != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (keel != null ? !keel.equals(that.keel) : that.keel != null) return false;
        if (phrf != null ? !phrf.equals(that.phrf) : that.phrf != null) return false;
        if (draft != null ? !draft.equals(that.draft) : that.draft != null) return false;
        if (beam != null ? !beam.equals(that.beam) : that.beam != null) return false;
        if (lwl != null ? !lwl.equals(that.lwl) : that.lwl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = boatId;
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 31 * result + (manufactureYear != null ? manufactureYear.hashCode() : 0);
        result = 31 * result + (registrationNum != null ? registrationNum.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (boatName != null ? boatName.hashCode() : 0);
        result = 31 * result + (sailNumber != null ? sailNumber.hashCode() : 0);
        result = 31 * result + (hasTrailer != null ? hasTrailer.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (keel != null ? keel.hashCode() : 0);
        result = 31 * result + (phrf != null ? phrf.hashCode() : 0);
        result = 31 * result + (draft != null ? draft.hashCode() : 0);
        result = 31 * result + (beam != null ? beam.hashCode() : 0);
        result = 31 * result + (lwl != null ? lwl.hashCode() : 0);
        return result;
    }
}
