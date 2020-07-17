/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author MB
 */
@Entity
@Table(name = "Agent", catalog = "RealtorsPortalSystem", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agent.findAll", query = "SELECT a FROM Agent a"),
    @NamedQuery(name = "Agent.findByAgentId", query = "SELECT a FROM Agent a WHERE a.agentId = :agentId"),
    @NamedQuery(name = "Agent.findByAgentAcount", query = "SELECT a FROM Agent a WHERE a.agentAcount = :agentAcount"),
    @NamedQuery(name = "Agent.findByAgentName", query = "SELECT a FROM Agent a WHERE a.agentName = :agentName"),
    @NamedQuery(name = "Agent.findByAgentPassword", query = "SELECT a FROM Agent a WHERE a.agentPassword = :agentPassword"),
    @NamedQuery(name = "Agent.findByAgentAddress", query = "SELECT a FROM Agent a WHERE a.agentAddress = :agentAddress"),
    @NamedQuery(name = "Agent.findByAgentPhone", query = "SELECT a FROM Agent a WHERE a.agentPhone = :agentPhone"),
    @NamedQuery(name = "Agent.findByAgentEmail", query = "SELECT a FROM Agent a WHERE a.agentEmail = :agentEmail"),
    @NamedQuery(name = "Agent.findByTaxCode", query = "SELECT a FROM Agent a WHERE a.taxCode = :taxCode"),
    @NamedQuery(name = "Agent.findByAgentAvatar", query = "SELECT a FROM Agent a WHERE a.agentAvatar = :agentAvatar"),
    @NamedQuery(name = "Agent.findByAgentActive", query = "SELECT a FROM Agent a WHERE a.agentActive = :agentActive")})
public class Agent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "AgentId", nullable = false)
    private Integer agentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AgentAcount", nullable = false, length = 20)
    private String agentAcount;
    @Size(max = 30)
    @Column(name = "AgentName", length = 30)
    private String agentName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AgentPassword", nullable = false, length = 20)
    private String agentPassword;
    @Size(max = 100)
    @Column(name = "AgentAddress", length = 100)
    private String agentAddress;
    @Size(max = 20)
    @Column(name = "AgentPhone", length = 20)
    private String agentPhone;
    @Size(max = 30)
    @Column(name = "AgentEmail", length = 30)
    private String agentEmail;
    @Size(max = 30)
    @Column(name = "TaxCode", length = 30)
    private String taxCode;
    @Size(max = 200)
    @Column(name = "AgentAvatar", length = 200)
    private String agentAvatar;
    @Column(name = "AgentActive")
    private Boolean agentActive;
    @OneToMany(mappedBy = "agentId")
    private List<Feedbacks> feedbacksList;
    @OneToMany(mappedBy = "agentId")
    private List<Advertisement> advertisementList;

    public Agent() {
    }

    public Agent(Integer agentId) {
        this.agentId = agentId;
    }

    public Agent(Integer agentId, String agentAcount, String agentPassword) {
        this.agentId = agentId;
        this.agentAcount = agentAcount;
        this.agentPassword = agentPassword;
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

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentPassword() {
        return agentPassword;
    }

    public void setAgentPassword(String agentPassword) {
        this.agentPassword = agentPassword;
    }

    public String getAgentAddress() {
        return agentAddress;
    }

    public void setAgentAddress(String agentAddress) {
        this.agentAddress = agentAddress;
    }

    public String getAgentPhone() {
        return agentPhone;
    }

    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone;
    }

    public String getAgentEmail() {
        return agentEmail;
    }

    public void setAgentEmail(String agentEmail) {
        this.agentEmail = agentEmail;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getAgentAvatar() {
        return agentAvatar;
    }

    public void setAgentAvatar(String agentAvatar) {
        this.agentAvatar = agentAvatar;
    }

    public Boolean getAgentActive() {
        return agentActive;
    }

    public void setAgentActive(Boolean agentActive) {
        this.agentActive = agentActive;
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
        hash += (agentId != null ? agentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agent)) {
            return false;
        }
        Agent other = (Agent) object;
        if ((this.agentId == null && other.agentId != null) || (this.agentId != null && !this.agentId.equals(other.agentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Agent[ agentId=" + agentId + " ]";
    }
    
}
