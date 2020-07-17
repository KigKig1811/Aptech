/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MB
 */
@Entity
@Table(name = "PhotoDetail", catalog = "RealtorsPortalSystem", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PhotoDetail.findAll", query = "SELECT p FROM PhotoDetail p"),
    @NamedQuery(name = "PhotoDetail.findByIdImage", query = "SELECT p FROM PhotoDetail p WHERE p.idImage = :idImage"),
    @NamedQuery(name = "PhotoDetail.findByImage", query = "SELECT p FROM PhotoDetail p WHERE p.image = :image"),
    @NamedQuery(name = "PhotoDetail.findByGuidimage", query = "SELECT p FROM PhotoDetail p WHERE p.guidimage = :guidimage"),
    @NamedQuery(name = "PhotoDetail.findByExtension", query = "SELECT p FROM PhotoDetail p WHERE p.extension = :extension")})
public class PhotoDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdImage", nullable = false)
    private Integer idImage;
    @Size(max = 200)
    @Column(name = "Image", length = 200)
    private String image;
    @Size(max = 36)
    @Column(name = "Guidimage", length = 36)
    private String guidimage;
    @Size(max = 20)
    @Column(name = "Extension", length = 20)
    private String extension;
    @JoinColumn(name = "AdvId", referencedColumnName = "AdvId")
    @ManyToOne
    private Advertisement advId;

    public PhotoDetail() {
    }

    public PhotoDetail(Integer idImage) {
        this.idImage = idImage;
    }

    public Integer getIdImage() {
        return idImage;
    }

    public void setIdImage(Integer idImage) {
        this.idImage = idImage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGuidimage() {
        return guidimage;
    }

    public void setGuidimage(String guidimage) {
        this.guidimage = guidimage;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Advertisement getAdvId() {
        return advId;
    }

    public void setAdvId(Advertisement advId) {
        this.advId = advId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idImage != null ? idImage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PhotoDetail)) {
            return false;
        }
        PhotoDetail other = (PhotoDetail) object;
        if ((this.idImage == null && other.idImage != null) || (this.idImage != null && !this.idImage.equals(other.idImage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PhotoDetail[ idImage=" + idImage + " ]";
    }
    
}
