/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.util.List;

/**
 *
 * @author MB
 */
public class ViewCommentDetails {
    private int rateId, rating, usedId,sellId, advId;
    private String name;
    private String icon_image;
    private List<ViewCommentChild> viewCommentChild; 

    public int getRateId() {
        return rateId;
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

    public int getUsedId() {
        return usedId;
    }

    public void setUsedId(int usedId) {
        this.usedId = usedId;
    }

    public int getSellId() {
        return sellId;
    }

    public void setSellId(int sellId) {
        this.sellId = sellId;
    }

    public int getAdvId() {
        return advId;
    }

    public void setAdvId(int advId) {
        this.advId = advId;
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

    public List<ViewCommentChild> getViewCommentChild() {
        return viewCommentChild;
    }

    public void setViewCommentChild(List<ViewCommentChild> viewCommentChild) {
        this.viewCommentChild = viewCommentChild;
    }
    
    
    
    
    
}
