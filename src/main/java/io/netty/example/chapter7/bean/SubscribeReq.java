package io.netty.example.chapter7.bean;

import java.io.Serializable;
/**
 * 请求
 * @Description 
 * @Project: server
 * @Date:2016-11-29
 * @Author dmf
 * @Copyright (c) 2016, 33e9 All Rights Reserved.
 */
public class SubscribeReq implements Serializable {

    private static final long serialVersionUID = 1l;
    private int subReqID;
    private String userName;
    private String productName;
    private String phoneNumber;
    private String address;

    public int getSubReqID() {
        return subReqID;
    }

    public void setSubReqID(int subReqID) {
        this.subReqID = subReqID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "SubscribeReq [subReqID=" + subReqID + ",userName=" + userName + ",productName=" + productName
                + ",phoneNumber=" + phoneNumber + ",address=" + address + "]";
    }
}
