/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author MB
 */
@Entity
@Table(name = "PrivateSeller", catalog = "RealtorsPortalSystem", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrivateSeller.findAll", query = "SELECT p FROM PrivateSeller p"),
    @NamedQuery(name = "PrivateSeller.findBySeLLId", query = "SELECT p FROM PrivateSeller p WHERE p.seLLId = :seLLId"),
    @NamedQuery(name = "PrivateSeller.findBySeLLAcount", query = "SELECT p FROM PrivateSeller p WHERE p.seLLAcount = :seLLAcount"),
    @NamedQuery(name = "PrivateSeller.findBySellPassword", query = "SELECT p FROM PrivateSeller p WHERE p.sellPassword = :sellPassword"),
    @NamedQuery(name = "PrivateSeller.findBySellFullname", query = "SELECT p FROM PrivateSeller p WHERE p.sellFullname = :sellFullname"),
    @NamedQuery(name = "PrivateSeller.findBySellGender", query = "SELECT p FROM PrivateSeller p WHERE p.sellGender = :sellGender"),
    @NamedQuery(name = "PrivateSeller.findBySellDob", query = "SELECT p FROM PrivateSeller p WHERE p.sellDob = :sellDob"),
    @NamedQuery(name = "PrivateSeller.findBySellAddress", query = "SELECT p FROM PrivateSeller p WHERE p.sellAddress = :sellAddress"),
    @NamedQuery(name = "PrivateSeller.findBySellPhone", query = "SELECT p FROM PrivateSeller p WHERE p.sellPhone = :sellPhone"),
    @NamedQuery(name = "PrivateSeller.findBySellEmail", query = "SELECT p FROM PrivateSeller p WHERE p.sellEmail = :sellEmail"),
    @NamedQuery(name = "PrivateSeller.findBySellActive", query = "SELECT p FROM PrivateSeller p WHERE p.sellActive = :sellActive")})
public class PrivateSeller implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SeLLId", nullable = false)
    private Integer seLLId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SeLLAcount", nullable = false, length = 20)
    private String seLLAcount;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SellPassword", nullable = false, length = 20)
    private String sellPassword;
    @Size(max = 50)
    @Column(name = "SellFullname", length = 50)
    private String sellFullname;
    @Column(name = "SellGender")
    private Boolean sellGender;
    @Column(name = "SellDob")
    @Temporal(TemporalType.DATE)
    private Date sellDob;
    @Size(max = 100)
    @Column(name = "SellAddress", length = 100)
    private String sellAddress;
    @Size(max = 20)
    @Column(name = "SellPhone", length = 20)
    private String sellPhone;
    @Size(max = 30)
    @Column(name = "SellEmail", length = 30)
    private String sellEmail;
    @Column(name = "SellActive")
    private Boolean sellActive;
    @OneToMany(mappedBy = "seLLId")
    private List<Feedbacks> feedbacksList;
    @OneToMany(mappedBy = "seLLId")
    private List<Advertisement> advertisementList;

    public PrivateSeller() {
    }

    public PrivateSeller(Integer seLLId) {
        this.seLLId = seLLId;
    }

    public PrivateSeller(Integer seLLId, String seLLAcount, String sellPassword) {
        this.seLLId = seLLId;
        this.seLLAcount = seLLAcount;
        this.sellPassword = sellPassword;
    }

    public Integer getSeLLId() {
        return seLLId;
    }

    public void setSeLLId(Integer seLLId) {
        this.seLLId = seLLId;
    }

    public String getSeLLAcount() {
        return seLLAcount;
    }

    public void setSeLLAcount(String seLLAcount) {
        this.seLLAcount = seLLAcount;
    }

    public String getSellPassword() {
        return sellPassword;
    }

    public void setSellPassword(String sellPassword) {
        this.sellPassword = sellPassword;
    }

    public String getSellFullname() {
        return sellFullname;
    }

    public void setSellFullname(String sellFullname) {
        this.sellFullname = sellFullname;
    }

    public Boolean getSellGender() {
        return sellGender;
    }

    public void setSellGender(Boolean sellGender) {
        this.sellGender = sellGender;
    }

    public Date getSellDob() {
        return sellDob;
    }

    public void setSellDob(Date sellDob) {
        this.sellDob = sellDob;
    }

    public String getSellAddress() {
        return sellAddress;
    }

    public void setSellAddress(String sellAddress) {
        this.sellAddress = sellAddress;
    }

    public String getSellPhone() {
        return sellPhone;
    }

    public void setSellPhone(String sellPhone) {
        this.sellPhone = sellPhone;
    }

    public String getSellEmail() {
        return sellEmail;
    }

    public void setSellEmail(String sellEmail) {
        this.sellEmail = sellEmail;
    }

    public Boolean getSellActive() {
        return sellActive;
    }

    public void setSellActive(Boolean sellActive) {
        this.sellActive = sellActive;
    }

    @XmlTransient
    public List<Feedbacks> getFeedbacksList() {
        return feedbacksList;
    }

    public void setFeedbacksList(List<Feedbacks> feedbacksList) {
        this.feedbacksList = feedbacksList;
    }

    @XmlTransient
    public List<Advertisement> getAdvertisementList() {
        return advertisementList;
    }

    public void setAdvertisementList(List<Advertisement> advertisementList) {
        this.advertisementList = advertisementList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seLLId != null ? seLLId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrivateSeller)) {
            return false;
        }
        PrivateSeller other = (PrivateSeller) object;
        if ((this.seLLId == null && other.seLLId != null) || (this.seLLId != null && !this.seLLId.equals(other.seLLId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PrivateSeller[ seLLId=" + seLLId + " ]";
    }
    
}
