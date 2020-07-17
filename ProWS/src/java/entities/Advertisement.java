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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author LENOVO
 */
@Entity
@Table(name = "Advertisement", catalog = "RealtorsPortalSystem", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Advertisement.findAll", query = "SELECT a FROM Advertisement a"),
    @NamedQuery(name = "Advertisement.findByAdvId", query = "SELECT a FROM Advertisement a WHERE a.advId = :advId"),
    @NamedQuery(name = "Advertisement.findByUserId", query = "SELECT a FROM Advertisement a WHERE a.userId = :userId"),
    @NamedQuery(name = "Advertisement.findByHeader", query = "SELECT a FROM Advertisement a WHERE a.header = :header"),
    @NamedQuery(name = "Advertisement.findByContent", query = "SELECT a FROM Advertisement a WHERE a.content = :content"),
    @NamedQuery(name = "Advertisement.findByPrice", query = "SELECT a FROM Advertisement a WHERE a.price = :price"),
    @NamedQuery(name = "Advertisement.findByAddress", query = "SELECT a FROM Advertisement a WHERE a.address = :address"),
    @NamedQuery(name = "Advertisement.findByStreet", query = "SELECT a FROM Advertisement a WHERE a.street = :street"),
    @NamedQuery(name = "Advertisement.findByDistrict", query = "SELECT a FROM Advertisement a WHERE a.district = :district"),
    @NamedQuery(name = "Advertisement.findByWard", query = "SELECT a FROM Advertisement a WHERE a.ward = :ward"),
    @NamedQuery(name = "Advertisement.findByCityProvince", query = "SELECT a FROM Advertisement a WHERE a.cityProvince = :cityProvince"),
    @NamedQuery(name = "Advertisement.findByArea", query = "SELECT a FROM Advertisement a WHERE a.area = :area"),
    @NamedQuery(name = "Advertisement.findByPhotothumbnail", query = "SELECT a FROM Advertisement a WHERE a.photothumbnail = :photothumbnail"),
    @NamedQuery(name = "Advertisement.findByDateUp", query = "SELECT a FROM Advertisement a WHERE a.dateUp = :dateUp"),
    @NamedQuery(name = "Advertisement.findByExpDate", query = "SELECT a FROM Advertisement a WHERE a.expDate = :expDate"),
    @NamedQuery(name = "Advertisement.findByAgentAcount", query = "SELECT a FROM Advertisement a WHERE a.agentAcount = :agentAcount"),
    @NamedQuery(name = "Advertisement.findBySellAcount", query = "SELECT a FROM Advertisement a WHERE a.sellAcount = :sellAcount"),
    @NamedQuery(name = "Advertisement.findByApproved", query = "SELECT a FROM Advertisement a WHERE a.approved = :approved"),
    @NamedQuery(name = "Advertisement.findByPaid", query = "SELECT a FROM Advertisement a WHERE a.paid = :paid"),
    @NamedQuery(name = "Advertisement.findByBedroom", query = "SELECT a FROM Advertisement a WHERE a.bedroom = :bedroom")})
public class Advertisement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "AdvId", nullable = false)
    private Integer advId;
    @Column(name = "UserId")
    private Integer userId;
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
    @JoinColumn(name = "AgentId", referencedColumnName = "AgentId")
    @ManyToOne
    private Agent agentId;
    @JoinColumn(name = "CateId", referencedColumnName = "CateId")
    @ManyToOne
    private Category cateId;
    @JoinColumn(name = "ModeId", referencedColumnName = "ModeId")
    @ManyToOne
    private Mode modeId;
    @JoinColumn(name = "SeLLId", referencedColumnName = "SeLLId")
    @ManyToOne
    private PrivateSeller seLLId;

    public Advertisement() {
    }

    public Advertisement(Integer advId) {
        this.advId = advId;
    }

    public Advertisement(Integer advId, String header, String content, double price, String address, double area, String photothumbnail, boolean approved, boolean paid, int bedroom) {
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

    public Agent getAgentId() {
        return agentId;
    }

    public void setAgentId(Agent agentId) {
        this.agentId = agentId;
    }

    public Category getCateId() {
        return cateId;
    }

    public void setCateId(Category cateId) {
        this.cateId = cateId;
    }

    public Mode getModeId() {
        return modeId;
    }

    public void setModeId(Mode modeId) {
        this.modeId = modeId;
    }

    public PrivateSeller getSeLLId() {
        return seLLId;
    }

    public void setSeLLId(PrivateSeller seLLId) {
        this.seLLId = seLLId;
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
        if (!(object instanceof Advertisement)) {
            return false;
        }
        Advertisement other = (Advertisement) object;
        if ((this.advId == null && other.advId != null) || (this.advId != null && !this.advId.equals(other.advId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Advertisement[ advId=" + advId + " ]";
    }
    
}
