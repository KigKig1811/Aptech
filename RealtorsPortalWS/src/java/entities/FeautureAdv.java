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
 * @author MB
 */
@Entity
@Table(name = "FeautureAdv", catalog = "RealtorsPortalSystem", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FeautureAdv.findAll", query = "SELECT f FROM FeautureAdv f"),
    @NamedQuery(name = "FeautureAdv.findByFeaAdvId", query = "SELECT f FROM FeautureAdv f WHERE f.feaAdvId = :feaAdvId"),
    @NamedQuery(name = "FeautureAdv.findByContent", query = "SELECT f FROM FeautureAdv f WHERE f.content = :content"),
    @NamedQuery(name = "FeautureAdv.findByHeader", query = "SELECT f FROM FeautureAdv f WHERE f.header = :header")})
public class FeautureAdv implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FeaAdvId", nullable = false)
    private Integer feaAdvId;
    @Size(max = 50)
    @Column(name = "Content", length = 50)
    private String content;
    @Size(max = 50)
    @Column(name = "Header", length = 50)
    private String header;

    public FeautureAdv() {
    }

    public FeautureAdv(Integer feaAdvId) {
        this.feaAdvId = feaAdvId;
    }

    public Integer getFeaAdvId() {
        return feaAdvId;
    }

    public void setFeaAdvId(Integer feaAdvId) {
        this.feaAdvId = feaAdvId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feaAdvId != null ? feaAdvId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FeautureAdv)) {
            return false;
        }
        FeautureAdv other = (FeautureAdv) object;
        if ((this.feaAdvId == null && other.feaAdvId != null) || (this.feaAdvId != null && !this.feaAdvId.equals(other.feaAdvId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.FeautureAdv[ feaAdvId=" + feaAdvId + " ]";
    }
    
}
