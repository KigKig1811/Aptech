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
@Table(name = "UserAdvDetails", catalog = "RealtorsPortalSystem", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserAdvDetails.findAll", query = "SELECT u FROM UserAdvDetails u"),
    @NamedQuery(name = "UserAdvDetails.findByOrderId", query = "SELECT u FROM UserAdvDetails u WHERE u.orderId = :orderId"),
    @NamedQuery(name = "UserAdvDetails.findByAdvId", query = "SELECT u FROM UserAdvDetails u WHERE u.advId = :advId"),
    @NamedQuery(name = "UserAdvDetails.findByAdvTitle", query = "SELECT u FROM UserAdvDetails u WHERE u.advTitle = :advTitle"),
    @NamedQuery(name = "UserAdvDetails.findByUserId", query = "SELECT u FROM UserAdvDetails u WHERE u.userId = :userId"),
    @NamedQuery(name = "UserAdvDetails.findBySeLLId", query = "SELECT u FROM UserAdvDetails u WHERE u.seLLId = :seLLId"),
    @NamedQuery(name = "UserAdvDetails.findBySeLLAccount", query = "SELECT u FROM UserAdvDetails u WHERE u.seLLAccount = :seLLAccount"),
    @NamedQuery(name = "UserAdvDetails.findByAgentId", query = "SELECT u FROM UserAdvDetails u WHERE u.agentId = :agentId"),
    @NamedQuery(name = "UserAdvDetails.findByAgentAccount", query = "SELECT u FROM UserAdvDetails u WHERE u.agentAccount = :agentAccount"),
    @NamedQuery(name = "UserAdvDetails.findBySubTotal", query = "SELECT u FROM UserAdvDetails u WHERE u.subTotal = :subTotal"),
    @NamedQuery(name = "UserAdvDetails.findByDateUp", query = "SELECT u FROM UserAdvDetails u WHERE u.dateUp = :dateUp"),
    @NamedQuery(name = "UserAdvDetails.findByExpDate", query = "SELECT u FROM UserAdvDetails u WHERE u.expDate = :expDate"),
    @NamedQuery(name = "UserAdvDetails.findByOnemonth", query = "SELECT u FROM UserAdvDetails u WHERE u.onemonth = :onemonth"),
    @NamedQuery(name = "UserAdvDetails.findByThreemonths", query = "SELECT u FROM UserAdvDetails u WHERE u.threemonths = :threemonths"),
    @NamedQuery(name = "UserAdvDetails.findBySixmonths", query = "SELECT u FROM UserAdvDetails u WHERE u.sixmonths = :sixmonths")})
public class UserAdvDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderId", nullable = false)
    private Integer orderId;
    @Column(name = "AdvId")
    private Integer advId;
    @Size(max = 300)
    @Column(name = "AdvTitle", length = 300)
    private String advTitle;
    @Column(name = "UserId")
    private Integer userId;
    @Column(name = "SeLLId")
    private Integer seLLId;
    @Size(max = 20)
    @Column(name = "SeLLAccount", length = 20)
    private String seLLAccount;
    @Column(name = "AgentId")
    private Integer agentId;
    @Size(max = 20)
    @Column(name = "AgentAccount", length = 20)
    private String agentAccount;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SubTotal", precision = 53)
    private Double subTotal;
    @Column(name = "DateUp")
    @Temporal(TemporalType.DATE)
    private Date dateUp;
    @Column(name = "ExpDate")
    @Temporal(TemporalType.DATE)
    private Date expDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Onemonth", nullable = false)
    private double onemonth;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Threemonths", nullable = false)
    private double threemonths;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Sixmonths", nullable = false)
    private double sixmonths;

    public UserAdvDetails() {
    }

    public UserAdvDetails(Integer orderId) {
        this.orderId = orderId;
    }

    public UserAdvDetails(Integer orderId, double onemonth, double threemonths, double sixmonths) {
        this.orderId = orderId;
        this.onemonth = onemonth;
        this.threemonths = threemonths;
        this.sixmonths = sixmonths;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getAdvId() {
        return advId;
    }

    public void setAdvId(Integer advId) {
        this.advId = advId;
    }

    public String getAdvTitle() {
        return advTitle;
    }

    public void setAdvTitle(String advTitle) {
        this.advTitle = advTitle;
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

    public String getSeLLAccount() {
        return seLLAccount;
    }

    public void setSeLLAccount(String seLLAccount) {
        this.seLLAccount = seLLAccount;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getAgentAccount() {
        return agentAccount;
    }

    public void setAgentAccount(String agentAccount) {
        this.agentAccount = agentAccount;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
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

    public double getOnemonth() {
        return onemonth;
    }

    public void setOnemonth(double onemonth) {
        this.onemonth = onemonth;
    }

    public double getThreemonths() {
        return threemonths;
    }

    public void setThreemonths(double threemonths) {
        this.threemonths = threemonths;
    }

    public double getSixmonths() {
        return sixmonths;
    }

    public void setSixmonths(double sixmonths) {
        this.sixmonths = sixmonths;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserAdvDetails)) {
            return false;
        }
        UserAdvDetails other = (UserAdvDetails) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.UserAdvDetails[ orderId=" + orderId + " ]";
    }
    
}
