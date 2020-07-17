/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class AdvertPagelist {
    
      private Integer advId;

    private String header;
  
    private String content;
  
    private double price;
  
    private String address;
    
    private String street;
  
    private String district;
    
    private String ward;
   
    private String cityProvince;
   
    private double area;
  
    private String photothumbnail;
    
    private Date dateUp;
   
    private Date expDate;
   
    private String agentAcount;
    
    private String sellAcount;
   
    private boolean approved;
  
    private boolean paid;
   
    private int bedroom;
    
    private Agent agentId;
  
    private Category cateId;
  
    private Mode modeId;
 
    private PrivateSeller seLLId;

    public AdvertPagelist() {
    }

    public AdvertPagelist(Integer advId, String header, String content, double price, 
            String address, String street, String district, String ward, String cityProvince, double area,
            String photothumbnail, Date dateUp, Date expDate, String agentAcount, String sellAcount, boolean approved,
            boolean paid, int bedroom, Agent agentId, Category cateId, Mode modeId, PrivateSeller seLLId) {
        this.advId = advId;
        this.header = header;
        this.content = content;
        this.price = price;
        this.address = address;
        this.street = street;
        this.district = district;
        this.ward = ward;
        this.cityProvince = cityProvince;
        this.area = area;
        this.photothumbnail = photothumbnail;
        this.dateUp = dateUp;
        this.expDate = expDate;
        this.agentAcount = agentAcount;
        this.sellAcount = sellAcount;
        this.approved = approved;
        this.paid = paid;
        this.bedroom = bedroom;
        this.agentId = agentId;
        this.cateId = cateId;
        this.modeId = modeId;
        this.seLLId = seLLId;
    }
    
    

    public Integer getAdvId() {
        return advId;
    }

    public void setAdvId(Integer advId) {
        this.advId = advId;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getCityProvince() {
        return cityProvince;
    }

    public void setCityProvince(String cityProvince) {
        this.cityProvince = cityProvince;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getPhotothumbnail() {
        return photothumbnail;
    }

    public void setPhotothumbnail(String photothumbnail) {
        this.photothumbnail = photothumbnail;
    }

    public Date getDateUp() {
        return dateUp;
    }

    public void setDateUp(Date dateUp) {
        this.dateUp = dateUp;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public String getAgentAcount() {
        return agentAcount;
    }

    public void setAgentAcount(String agentAcount) {
        this.agentAcount = agentAcount;
    }

    public String getSellAcount() {
        return sellAcount;
    }

    public void setSellAcount(String sellAcount) {
        this.sellAcount = sellAcount;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public Agent getAgentId() {
        return agentId;
    }

    public void setAgentId(Agent agentId) {
        this.agentId = agentId;
    }

    public Category getCateId() {
        return cateId;
    }

    public void setCateId(Category cateId) {
        this.cateId = cateId;
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
    
    
    
}
