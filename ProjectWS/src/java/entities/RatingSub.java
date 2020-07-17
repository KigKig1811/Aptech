/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.sql.Timestamp;

/**
 *
 * @author MB
 */
public class RatingSub {
    private int ratesubId;
    private String content;
    private int rateId;
    private int userId;
    private Timestamp ratingsubDate;

    public int getRatesubId() {
        return ratesubId;
    }

    public RatingSub() {
    }
    
    
    public RatingSub(int ratesubId, String content, int rateId, int userId, Timestamp ratingsubDate) {
        this.ratesubId = ratesubId;
        this.content = content;
        this.rateId = rateId;
        this.userId = userId;
        this.ratingsubDate = ratingsubDate;
    }
    
    

    public void setRatesubId(int ratesubId) {
        this.ratesubId = ratesubId;
    }

    public String getContent() {
        
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRateId() {
        return rateId;
    }

    public void setRateId(int rateId) {
        this.rateId = rateId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Timestamp getRatingsubDate() {
        return ratingsubDate;
    }

    public void setRatingsubDate(Timestamp ratingsubDate) {
        this.ratingsubDate = ratingsubDate;
    }
    
    
    
}
