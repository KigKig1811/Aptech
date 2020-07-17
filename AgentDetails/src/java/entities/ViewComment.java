/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.util.Date;

/**
 *
 * @author MB
 */
public class ViewComment {
    private int rateId,
                ratesubId,
                rating,
                usedId,
                agentId;
    private Date ratingsubDate;
    private String name;
    private String icon_image;
    private String content;

    public ViewComment() {
    }

    public ViewComment(int rateId, int ratesubId, int rating, int usedId, int agentId, Date ratingsubDate, String name, String icon_image, String content) {
        this.rateId = rateId;
        this.ratesubId = ratesubId;
        this.rating = rating;
        this.usedId = usedId;
        this.agentId = agentId;
        this.ratingsubDate = ratingsubDate;
        this.name = name;
        this.icon_image = icon_image;
        this.content = content;
    }
    
    

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }
    
     

   

    
     public int getRateId() {
        return rateId;
    }
    
    
    
    public void setRateId(int rateId) {
        this.rateId = rateId;
    }

    public int getRatesubId() {
        return ratesubId;
    }

    public void setRatesubId(int ratesubId) {
        this.ratesubId = ratesubId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getUsedId() {
        return usedId;
    }

    public void setUsedId(int usedId) {
        this.usedId = usedId;
    }

    
    public Date getRatingsubDate() {
        return ratingsubDate;
    }

    public void setRatingsubDate(Date ratingsubDate) {
        this.ratingsubDate = ratingsubDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon_image() {
        return icon_image;
    }

    public void setIcon_image(String icon_image) {
        this.icon_image = icon_image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
    
    
}
