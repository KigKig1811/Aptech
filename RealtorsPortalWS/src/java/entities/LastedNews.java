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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MB
 */
@Entity
@Table(name = "LastedNews", catalog = "RealtorsPortalSystem", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LastedNews.findAll", query = "SELECT l FROM LastedNews l"),
    @NamedQuery(name = "LastedNews.findByNewsId", query = "SELECT l FROM LastedNews l WHERE l.newsId = :newsId")})
public class LastedNews implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NewsId", nullable = false)
    private Integer newsId;
    @JoinColumn(name = "AdvId", referencedColumnName = "AdvId")
    @ManyToOne
    private Advertisement advId;

    public LastedNews() {
    }

    public LastedNews(Integer newsId) {
        this.newsId = newsId;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public Advertisement getAdvId() {
        return advId;
    }

    public void setAdvId(Advertisement advId) {
        this.advId = advId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (newsId != null ? newsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LastedNews)) {
            return false;
        }
        LastedNews other = (LastedNews) object;
        if ((this.newsId == null && other.newsId != null) || (this.newsId != null && !this.newsId.equals(other.newsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.LastedNews[ newsId=" + newsId + " ]";
    }
    
}
