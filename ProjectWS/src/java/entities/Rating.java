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
public class Rating {
    private int rateId;
    private int rating;
    private int advId;
    private int userId;
    private Timestamp ratingDate;
    

    public int getRateId() {
        return rateId;
    }

    public Rating() {
    }

    public Rating(int rateId, int rating, int advId, int userId, Timestamp ratingDate) {
        this.rateId = rateId;
        this.rating = rating;
        this.advId = advId;
        this.userId = userId;
        this.ratingDate = ratingDate;
    }
    
    

    public void setRateId(int rateId) {
        this.rateId = rateId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getAdvId() {
        return advId;
    }

    public void setAdvId(int advId) {
        this.advId = advId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Timestamp getRatingDate() {
        return ratingDate;
    }

    public void setRatingDate(Timestamp ratingDate) {
        this.ratingDate = ratingDate;
    }
    
    
    
    
}
