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
@Table(name = "Follow", catalog = "RealtorsPortalSystem", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Follow.findAll", query = "SELECT f FROM Follow f"),
    @NamedQuery(name = "Follow.findByIdFollow", query = "SELECT f FROM Follow f WHERE f.idFollow = :idFollow"),
    @NamedQuery(name = "Follow.findByAdvId", query = "SELECT f FROM Follow f WHERE f.advId = :advId"),
    @NamedQuery(name = "Follow.findBySellerAccount", query = "SELECT f FROM Follow f WHERE f.sellerAccount = :sellerAccount"),
    @NamedQuery(name = "Follow.findByAgentAccount", query = "SELECT f FROM Follow f WHERE f.agentAccount = :agentAccount"),
    @NamedQuery(name = "Follow.findByPhoto", query = "SELECT f FROM Follow f WHERE f.photo = :photo"),
    @NamedQuery(name = "Follow.findByHeader", query = "SELECT f FROM Follow f WHERE f.header = :header"),
    @NamedQuery(name = "Follow.findByContentFL", query = "SELECT f FROM Follow f WHERE f.contentFL = :contentFL"),
    @NamedQuery(name = "Follow.findByNguoiFollow", query = "SELECT f FROM Follow f WHERE f.nguoiFollow = :nguoiFollow")})
public class Follow implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdFollow", nullable = false)
    private Integer idFollow;
    @Column(name = "AdvId")
    private Integer advId;
    @Size(max = 20)
    @Column(name = "SellerAccount", length = 20)
    private String sellerAccount;
    @Size(max = 10)
    @Column(name = "AgentAccount", length = 10)
    private String agentAccount;
    @Size(max = 300)
    @Column(name = "Photo", length = 300)
    private String photo;
    @Size(max = 300)
    @Column(name = "Header", length = 300)
    private String header;
    @Size(max = 3000)
    @Column(name = "ContentFL", length = 3000)
    private String contentFL;
    @Size(max = 20)
    @Column(name = "NguoiFollow", length = 20)
    private String nguoiFollow;

    public Follow() {
    }

    public Follow(Integer idFollow) {
        this.idFollow = idFollow;
    }

    public Integer getIdFollow() {
        return idFollow;
    }

    public void setIdFollow(Integer idFollow) {
        this.idFollow = idFollow;
    }

    public Integer getAdvId() {
        return advId;
    }

    public void setAdvId(Integer advId) {
        this.advId = advId;
    }

    public String getSellerAccount() {
        return sellerAccount;
    }

    public void setSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
    }

    public String getAgentAccount() {
        return agentAccount;
    }

    public void setAgentAccount(String agentAccount) {
        this.agentAccount = agentAccount;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContentFL() {
        return contentFL;
    }

    public void setContentFL(String contentFL) {
        this.contentFL = contentFL;
    }

    public String getNguoiFollow() {
        return nguoiFollow;
    }

    public void setNguoiFollow(String nguoiFollow) {
        this.nguoiFollow = nguoiFollow;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFollow != null ? idFollow.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Follow)) {
            return false;
        }
        Follow other = (Follow) object;
        if ((this.idFollow == null && other.idFollow != null) || (this.idFollow != null && !this.idFollow.equals(other.idFollow))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Follow[ idFollow=" + idFollow + " ]";
    }
    
}
