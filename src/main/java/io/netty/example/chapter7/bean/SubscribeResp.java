package io.netty.example.chapter7.bean;

import java.io.Serializable;

/**
 * 
 * @Description 
 * @Project: server
 * @Date:2016-11-29
 * @Author dmf
 * @Copyright (c) 2016, 33e9 All Rights Reserved.
 */
public class SubscribeResp implements Serializable {

    private static final long serialVersionUID = 1L;
    private int subReqID;
    private int respCode;
    private String desc;

    public int getSubReqID() {
        return subReqID;
    }

    public void setSubReqID(int subReqID) {
        this.subReqID = subReqID;
    }

    public int getRespCode() {
        return respCode;
    }

    public void setRespCode(int respCode) {
        this.respCode = respCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "SubscribeResp [subReqID=" + subReqID + ", respCode=" + respCode + ",desc=" + desc + "]";
    }

}
