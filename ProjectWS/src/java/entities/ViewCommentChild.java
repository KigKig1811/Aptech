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
public class ViewCommentChild {
    private int ratingSub, userId;
    private Date ratingsubDate;
    private String content;

    public ViewCommentChild() {
    }

    public ViewCommentChild(int ratingSub, int userId, Date ratingsubDate, String content) {
        this.ratingSub = ratingSub;
        this.userId = userId;
        this.ratingsubDate = ratingsubDate;
        this.content = content;
    }

    public int getRatingSub() {
        return ratingSub;
    }

    public void setRatingSub(int ratingSub) {
        this.ratingSub = ratingSub;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getRatingsubDate() {
        return ratingsubDate;
    }

    public void setRatingsubDate(Date ratingsubDate) {
        this.ratingsubDate = ratingsubDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
    
}
