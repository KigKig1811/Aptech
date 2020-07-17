/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MB
 */
@Entity
@Table(name = "Follow", catalog = "RealtorsPortalSystem", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Follow.findAll", query = "SELECT f FROM Follow f"),
    @NamedQuery(name = "Follow.findByAdvId", query = "SELECT f FROM Follow f WHERE f.advId = :advId"),
    @NamedQuery(name = "Follow.findByUserId", query = "SELECT f FROM Follow f WHERE f.userId = :userId"),
    @NamedQuery(name = "Follow.findBySeLLId", query = "SELECT f FROM Follow f WHERE f.seLLId = :seLLId"),
    @NamedQuery(name = "Follow.findByModeId", query = "SELECT f FROM Follow f WHERE f.modeId = :modeId"),
    @NamedQuery(name = "Follow.findByCateId", query = "SELECT f FROM Follow f WHERE f.cateId = :cateId"),
    @NamedQuery(name = "Follow.findByHeader", query = "SELECT f FROM Follow f WHERE f.header = :header"),
    @NamedQuery(name = "Follow.findByContent", query = "SELECT f FROM Follow f WHERE f.content = :content"),
    @NamedQuery(name = "Follow.findByPrice", query = "SELECT f FROM Follow f WHERE f.price = :price"),
    @NamedQuery(name = "Follow.findByAddress", query = "SELECT f FROM Follow f WHERE f.address = :address"),
    @NamedQuery(name = "Follow.findByStreet", query = "SELECT f FROM Follow f WHERE f.street = :street"),
    @NamedQuery(name = "Follow.findByDistrict", query = "SELECT f FROM Follow f WHERE f.district = :district"),
    @NamedQuery(name = "Follow.findByWard", query = "SELECT f FROM Follow f WHERE f.ward = :ward"),
    @NamedQuery(name = "Follow.findByCityProvince", query = "SELECT f FROM Follow f WHERE f.cityProvince = :cityProvince"),
    @NamedQuery(name = "Follow.findByArea", query = "SELECT f FROM Follow f WHERE f.area = :area"),
    @NamedQuery(name = "Follow.findByPhotothumbnail", query = "SELECT f FROM Follow f WHERE f.photothumbnail = :photothumbnail"),
    @NamedQuery(name = "Follow.findByDateUp", query = "SELECT f FROM Follow f WHERE f.dateUp = :dateUp"),
    @NamedQuery(name = "Follow.findByExpDate", query = "SELECT f FROM Follow f WHERE f.expDate = :expDate"),
    @NamedQuery(name = "Follow.findByAgentId", query = "SELECT f FROM Follow f WHERE f.agentId = :agentId"),
    @NamedQuery(name = "Follow.findByAgentAcount", query = "SELECT f FROM Follow f WHERE f.agentAcount = :agentAcount"),
    @NamedQuery(name = "Follow.findBySellAcount", query = "SELECT f FROM Follow f WHERE f.sellAcount = :sellAcount"),
    @NamedQuery(name = "Follow.findByApproved", query = "SELECT f FROM Follow f WHERE f.approved = :approved"),
    @NamedQuery(name = "Follow.findByPaid", query = "SELECT f FROM Follow f WHERE f.paid = :paid"),
    @NamedQuery(name = "Follow.findByBedroom", query = "SELECT f FROM Follow f WHERE f.bedroom = :bedroom")})
public class Follow implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "AdvId", nullable = false)
    private Integer advId;
    @Column(name = "UserId")
    private Integer userId;
    @Column(name = "SeLLId")
    private Integer seLLId;
    @Column(name = "ModeId")
    private Integer modeId;
    @Column(name = "CateId")
    private Integer cateId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "Header", nullable = false, length = 300)
    private String header;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3000)
    @Column(name = "Content", nullable = false, length = 3000)
    private String content;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Price", nullable = false)
    private double price;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Address", nullable = false, length = 50)
    private String address;
    @Size(max = 50)
    @Column(name = "Street", length = 50)
    private String street;
    @Size(max = 50)
    @Column(name = "District", length = 50)
    private String district;
    @Size(max = 50)
    @Column(name = "Ward", length = 50)
    private String ward;
    @Size(max = 50)
    @Column(name = "CityProvince", length = 50)
    private String cityProvince;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Area", nullable = false)
    private double area;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "Photothumbnail", nullable = false, length = 300)
    private String photothumbnail;
    @Column(name = "DateUp")
    @Temporal(TemporalType.DATE)
    private Date dateUp;
    @Column(name = "ExpDate")
    @Temporal(TemporalType.DATE)
    private Date expDate;
    @Column(name = "AgentId")
    private Integer agentId;
    @Size(max = 20)
    @Column(name = "AgentAcount", length = 20)
    private String agentAcount;
    @Size(max = 20)
    @Column(name = "SellAcount", length = 20)
    private String sellAcount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Approved", nullable = false)
    private boolean approved;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Paid", nullable = false)
    private boolean paid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bedroom", nullable = false)
    private int bedroom;

    public Follow() {
    }

    public Follow(Integer advId) {
        this.advId = advId;
    }

    public Follow(Integer advId, String header, String content, double price, String address, double area, String photothumbnail, boolean approved, boolean paid, int bedroom) {
        this.advId = advId;
        this.header = header;
        this.content = content;
        this.price = price;
        this.address = address;
        this.area = area;
        this.photothumbnail = photothumbnail;
        this.approved = approved;
        this.paid = paid;
        this.bedroom = bedroom;
    }

    public Follow(Integer advId, Integer userId, Integer seLLId, Integer modeId, Integer cateId, String header, String content, double price, String address, String street, String district, String ward, 
                    String cityProvince, double area, String photothumbnail, Date dateUp, Date expDate, Integer agentId, String agentAcount, String sellAcount, boolean approved, boolean paid, int bedroom) {
        this.advId = advId;
        this.userId = userId;
        this.seLLId = seLLId;
        this.modeId = modeId;
        this.cateId = cateId;
        this.header = header;
        this.content = content;
        this.price = price;
        this.address = address;
        this.street = street;
        this.district = district;
        this.ward = ward;
        this.cityProvince = cityProvince;
        this.area = area;
        this.photothumbnail = photothumbnail;
        this.dateUp = dateUp;
        this.expDate = expDate;
        this.agentId = agentId;
        this.agentAcount = agentAcount;
        this.sellAcount = sellAcount;
        this.approved = approved;
        this.paid = paid;
        this.bedroom = bedroom;
    }
    

    public Integer getAdvId() {
        return advId;
    }

    public void setAdvId(Integer advId) {
        this.advId = advId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSeLLId() {
        return seLLId;
    }

    public void setSeLLId(Integer seLLId) {
        this.seLLId = seLLId;
    }

    public Integer getModeId() {
        return modeId;
    }

    public void setModeId(Integer modeId) {
        this.modeId = modeId;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getCityProvince() {
        return cityProvince;
    }

    public void setCityProvince(String cityProvince) {
        this.cityProvince = cityProvince;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getPhotothumbnail() {
        return photothumbnail;
    }

    public void setPhotothumbnail(String photothumbnail) {
        this.photothumbnail = photothumbnail;
    }

    public Date getDateUp() {
        return dateUp;
    }

    public void setDateUp(Date dateUp) {
        this.dateUp = dateUp;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getAgentAcount() {
        return agentAcount;
    }

    public void setAgentAcount(String agentAcount) {
        this.agentAcount = agentAcount;
    }

    public String getSellAcount() {
        return sellAcount;
    }

    public void setSellAcount(String sellAcount) {
        this.sellAcount = sellAcount;
    }

    public boolean getApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (advId != null ? advId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Follow)) {
            return false;
        }
        Follow other = (Follow) object;
        if ((this.advId == null && other.advId != null) || (this.advId != null && !this.advId.equals(other.advId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Follow[ advId=" + advId + " ]";
    }
    
}
