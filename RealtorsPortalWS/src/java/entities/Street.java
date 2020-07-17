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
@Table(name = "Street", catalog = "RealtorsPortalSystem", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Street.findAll", query = "SELECT s FROM Street s"),
    @NamedQuery(name = "Street.findByStreetId", query = "SELECT s FROM Street s WHERE s.streetId = :streetId"),
    @NamedQuery(name = "Street.findByStreetName", query = "SELECT s FROM Street s WHERE s.streetName = :streetName")})
public class Street implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "StreetId", nullable = false)
    private Integer streetId;
    @Size(max = 100)
    @Column(name = "StreetName", length = 100)
    private String streetName;
    @JoinColumn(name = "CityId", referencedColumnName = "CityId")
    @ManyToOne
    private City cityId;
    @JoinColumn(name = "DistrictId", referencedColumnName = "DistrictId")
    @ManyToOne
    private District districtId;
    @JoinColumn(name = "WardId", referencedColumnName = "WardId")
    @ManyToOne
    private Ward wardId;

    public Street() {
    }

    public Street(Integer streetId) {
        this.streetId = streetId;
    }

    public Integer getStreetId() {
        return streetId;
    }

    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public City getCityId() {
        return cityId;
    }

    public void setCityId(City cityId) {
        this.cityId = cityId;
    }

    public District getDistrictId() {
        return districtId;
    }

    public void setDistrictId(District districtId) {
        this.districtId = districtId;
    }

    public Ward getWardId() {
        return wardId;
    }

    public void setWardId(Ward wardId) {
        this.wardId = wardId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (streetId != null ? streetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Street)) {
            return false;
        }
        Street other = (Street) object;
        if ((this.streetId == null && other.streetId != null) || (this.streetId != null && !this.streetId.equals(other.streetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Street[ streetId=" + streetId + " ]";
    }
    
}
