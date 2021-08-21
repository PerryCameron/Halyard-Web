package main.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "boat_picture", schema = "ECSC_SQL", catalog = "")
public class BoatPictureEntity {
    private int boatPictureId;
    private Date boatPictureDate;
    private String picturePath;
    private BoatEntity boatByBoatId;

    @Id
    @Column(name = "BOAT_PICTURE_ID")
    public int getBoatPictureId() {
        return boatPictureId;
    }

    public void setBoatPictureId(int boatPictureId) {
        this.boatPictureId = boatPictureId;
    }

    @Basic
    @Column(name = "BOAT_PICTURE_DATE")
    public Date getBoatPictureDate() {
        return boatPictureDate;
    }

    public void setBoatPictureDate(Date boatPictureDate) {
        this.boatPictureDate = boatPictureDate;
    }

    @Basic
    @Column(name = "PICTURE_PATH")
    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoatPictureEntity that = (BoatPictureEntity) o;

        if (boatPictureId != that.boatPictureId) return false;
        if (boatPictureDate != null ? !boatPictureDate.equals(that.boatPictureDate) : that.boatPictureDate != null)
            return false;
        if (picturePath != null ? !picturePath.equals(that.picturePath) : that.picturePath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = boatPictureId;
        result = 31 * result + (boatPictureDate != null ? boatPictureDate.hashCode() : 0);
        result = 31 * result + (picturePath != null ? picturePath.hashCode() : 0);
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
