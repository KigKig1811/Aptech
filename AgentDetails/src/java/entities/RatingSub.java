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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "RatingSub", catalog = "RealtorsPortalSystem", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RatingSub.findAll", query = "SELECT r FROM RatingSub r"),
    @NamedQuery(name = "RatingSub.findByRatingSubId", query = "SELECT r FROM RatingSub r WHERE r.ratingSubId = :ratingSubId"),
    @NamedQuery(name = "RatingSub.findByRateId", query = "SELECT r FROM RatingSub r WHERE r.rateId = :rateId"),
    @NamedQuery(name = "RatingSub.findByContent", query = "SELECT r FROM RatingSub r WHERE r.content = :content"),
    @NamedQuery(name = "RatingSub.findByUserId", query = "SELECT r FROM RatingSub r WHERE r.userId = :userId"),
    @NamedQuery(name = "RatingSub.findByRatingSubDate", query = "SELECT r FROM RatingSub r WHERE r.ratingSubDate = :ratingSubDate")})
public class RatingSub implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "RatingSubId", nullable = false)
    private Integer ratingSubId;
    @Column(name = "RateId")
    private Integer rateId;
    @Size(max = 2147483647)
    @Column(name = "Content", length = 2147483647)
    private String content;
    @Column(name = "UserId")
    private Integer userId;
    @Column(name = "RatingSubDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ratingSubDate;
    @JoinColumn(name = "RatingSubId", referencedColumnName = "RateId", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Rating rating;

    public RatingSub() {
    }

    public RatingSub(Integer ratingSubId) {
        this.ratingSubId = ratingSubId;
    }

    public Integer getRatingSubId() {
        return ratingSubId;
    }

    public void setRatingSubId(Integer ratingSubId) {
        this.ratingSubId = ratingSubId;
    }

    public Integer getRateId() {
        return rateId;
    }

    public void setRateId(Integer rateId) {
        this.rateId = rateId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getRatingSubDate() {
        return ratingSubDate;
    }

    public void setRatingSubDate(Date ratingSubDate) {
        this.ratingSubDate = ratingSubDate;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ratingSubId != null ? ratingSubId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RatingSub)) {
            return false;
        }
        RatingSub other = (RatingSub) object;
        if ((this.ratingSubId == null && other.ratingSubId != null) || (this.ratingSubId != null && !this.ratingSubId.equals(other.ratingSubId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.RatingSub[ ratingSubId=" + ratingSubId + " ]";
    }
    
}
