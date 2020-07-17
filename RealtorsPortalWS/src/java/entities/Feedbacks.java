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
 * @author MB
 */
@Entity
@Table(name = "Feedbacks", catalog = "RealtorsPortalSystem", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Feedbacks.findAll", query = "SELECT f FROM Feedbacks f"),
    @NamedQuery(name = "Feedbacks.findByFeedbackId", query = "SELECT f FROM Feedbacks f WHERE f.feedbackId = :feedbackId"),
    @NamedQuery(name = "Feedbacks.findByFeedbackContent", query = "SELECT f FROM Feedbacks f WHERE f.feedbackContent = :feedbackContent"),
    @NamedQuery(name = "Feedbacks.findByFeedbackReply", query = "SELECT f FROM Feedbacks f WHERE f.feedbackReply = :feedbackReply")})
public class Feedbacks implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FeedbackId", nullable = false)
    private Integer feedbackId;
    @Size(max = 1000)
    @Column(name = "FeedbackContent", length = 1000)
    private String feedbackContent;
    @Size(max = 1000)
    @Column(name = "FeedbackReply", length = 1000)
    private String feedbackReply;
    @JoinColumn(name = "AgentId", referencedColumnName = "AgentId")
    @ManyToOne
    private Agent agentId;
    @JoinColumn(name = "ModeId", referencedColumnName = "ModeId")
    @ManyToOne
    private Mode modeId;
    @JoinColumn(name = "SeLLId", referencedColumnName = "SeLLId")
    @ManyToOne
    private PrivateSeller seLLId;

    public Feedbacks() {
    }

    public Feedbacks(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public String getFeedbackReply() {
        return feedbackReply;
    }

    public void setFeedbackReply(String feedbackReply) {
        this.feedbackReply = feedbackReply;
    }

    public Agent getAgentId() {
        return agentId;
    }

    public void setAgentId(Agent agentId) {
        this.agentId = agentId;
    }

    public Mode getModeId() {
        return modeId;
    }

    public void setModeId(Mode modeId) {
        this.modeId = modeId;
    }

    public PrivateSeller getSeLLId() {
        return seLLId;
    }

    public void setSeLLId(PrivateSeller seLLId) {
        this.seLLId = seLLId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feedbackId != null ? feedbackId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feedbacks)) {
            return false;
        }
        Feedbacks other = (Feedbacks) object;
        if ((this.feedbackId == null && other.feedbackId != null) || (this.feedbackId != null && !this.feedbackId.equals(other.feedbackId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Feedbacks[ feedbackId=" + feedbackId + " ]";
    }
    
}
