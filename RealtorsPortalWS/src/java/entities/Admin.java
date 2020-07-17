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
@Table(name = "Admin", catalog = "RealtorsPortalSystem", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a"),
    @NamedQuery(name = "Admin.findByAdminAcount", query = "SELECT a FROM Admin a WHERE a.adminAcount = :adminAcount"),
    @NamedQuery(name = "Admin.findByAdminPass", query = "SELECT a FROM Admin a WHERE a.adminPass = :adminPass")})
public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "AdminAcount", nullable = false, length = 30)
    private String adminAcount;
    @Size(max = 30)
    @Column(name = "AdminPass", length = 30)
    private String adminPass;

    public Admin() {
    }

    public Admin(String adminAcount) {
        this.adminAcount = adminAcount;
    }

    public String getAdminAcount() {
        return adminAcount;
    }

    public void setAdminAcount(String adminAcount) {
        this.adminAcount = adminAcount;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adminAcount != null ? adminAcount.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.adminAcount == null && other.adminAcount != null) || (this.adminAcount != null && !this.adminAcount.equals(other.adminAcount))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Admin[ adminAcount=" + adminAcount + " ]";
    }
    
}
