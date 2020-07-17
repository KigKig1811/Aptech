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
 * @author LENOVO
 */
@Entity
@Table(name = "Notifications", catalog = "RealtorsPortalSystem", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notifications.findAll", query = "SELECT n FROM Notifications n"),
    @NamedQuery(name = "Notifications.findByIdNotice", query = "SELECT n FROM Notifications n WHERE n.idNotice = :idNotice"),
    @NamedQuery(name = "Notifications.findBySellAccount", query = "SELECT n FROM Notifications n WHERE n.sellAccount = :sellAccount"),
    @NamedQuery(name = "Notifications.findByAgentAccount", query = "SELECT n FROM Notifications n WHERE n.agentAccount = :agentAccount"),
    @NamedQuery(name = "Notifications.findByContent", query = "SELECT n FROM Notifications n WHERE n.content = :content"),
    @NamedQuery(name = "Notifications.findByReaded", query = "SELECT n FROM Notifications n WHERE n.readed = :readed"),
    @NamedQuery(name = "Notifications.findByDeleteStatus", query = "SELECT n FROM Notifications n WHERE n.deleteStatus = :deleteStatus")})
public class Notifications implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdNotice", nullable = false)
    private Integer idNotice;
    @Size(max = 20)
    @Column(name = "SellAccount", length = 20)
    private String sellAccount;
    @Size(max = 20)
    @Column(name = "AgentAccount", length = 20)
    private String agentAccount;
    @Size(max = 300)
    @Column(name = "Content", length = 300)
    private String content;
    @Column(name = "Readed")
    private Boolean readed;
    @Column(name = "DeleteStatus")
    private Boolean deleteStatus;
    @JoinColumn(name = "AdvId", referencedColumnName = "AdvId")
    @ManyToOne
    private Advertisement advId;
    @JoinColumn(name = "UserId", referencedColumnName = "UserId")
    @ManyToOne
    private User userId;

    public Notifications() {
    }

    public Notifications(Integer idNotice) {
        this.idNotice = idNotice;
    }

    public Integer getIdNotice() {
        return idNotice;
    }

    public void setIdNotice(Integer idNotice) {
        this.idNotice = idNotice;
    }

    public String getSellAccount() {
        return sellAccount;
    }

    public void setSellAccount(String sellAccount) {
        this.sellAccount = sellAccount;
    }

    public String getAgentAccount() {
        return agentAccount;
    }

    public void setAgentAccount(String agentAccount) {
        this.agentAccount = agentAccount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getReaded() {
        return readed;
    }

    public void setReaded(Boolean readed) {
        this.readed = readed;
    }

    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Advertisement getAdvId() {
        return advId;
    }

    public void setAdvId(Advertisement advId) {
        this.advId = advId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNotice != null ? idNotice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notifications)) {
            return false;
        }
        Notifications other = (Notifications) object;
        if ((this.idNotice == null && other.idNotice != null) || (this.idNotice != null && !this.idNotice.equals(other.idNotice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Notifications[ idNotice=" + idNotice + " ]";
    }
    
}
