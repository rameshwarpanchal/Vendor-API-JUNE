package com.thinkconstructive.restdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StoreInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer storeId;
    private String storeName;
    private String storeDetails;
    private String phoneNumber;

    public StoreInformation( String storeName, String storeDetails, String phoneNumber) {

        this.storeName = storeName;
        this.storeDetails = storeDetails;
        this.phoneNumber = phoneNumber;
    }

    public StoreInformation() {
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreDetails() {
        return storeDetails;
    }

    public void setStoreDetails(String storeDetails) {
        this.storeDetails = storeDetails;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "StoreInformation{" +
                "storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", storeDetails='" + storeDetails + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
