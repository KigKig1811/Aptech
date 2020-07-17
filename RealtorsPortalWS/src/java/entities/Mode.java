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
@Table(name = "Mode", catalog = "RealtorsPortalSystem", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mode.findAll", query = "SELECT m FROM Mode m"),
    @NamedQuery(name = "Mode.findByModeId", query = "SELECT m FROM Mode m WHERE m.modeId = :modeId"),
    @NamedQuery(name = "Mode.findByModeName", query = "SELECT m FROM Mode m WHERE m.modeName = :modeName")})
public class Mode implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModeId", nullable = false)
    private Integer modeId;
    @Size(max = 20)
    @Column(name = "ModeName", length = 20)
    private String modeName;
    @OneToMany(mappedBy = "modeId")
    private List<Follow> followList;
    @OneToMany(mappedBy = "modeId")
    private List<Feedbacks> feedbacksList;
    @OneToMany(mappedBy = "modeId")
    private List<Advertisement> advertisementList;

    public Mode() {
    }

    public Mode(Integer modeId) {
        this.modeId = modeId;
    }

    public Integer getModeId() {
        return modeId;
    }

    public void setModeId(Integer modeId) {
        this.modeId = modeId;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    @XmlTransient
    public List<Follow> getFollowList() {
        return followList;
    }

    public void setFollowList(List<Follow> followList) {
        this.followList = followList;
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
        hash += (modeId != null ? modeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mode)) {
            return false;
        }
        Mode other = (Mode) object;
        if ((this.modeId == null && other.modeId != null) || (this.modeId != null && !this.modeId.equals(other.modeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mode[ modeId=" + modeId + " ]";
    }
    
}
