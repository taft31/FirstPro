package com.huayu.taft.DTO;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by taft on 15/9/9.
 */
public class GoodsDTO {
    private String good_ID;
    private String good_Batch;
    private String good_Name;
    private double good_Price;
    private Date good_MadeTime;
    private int good_ExpireTime;//µ¥Î»ÔÂ
    private int good_SeeCount;
    private int good_State;
    private ArrayList<String> good_Resource;

    public GoodsDTO() {
    }

    public GoodsDTO(String good_ID, String good_Batch, String good_Name, double good_Price, Date good_MadeTime, int good_ExpireTime, int good_SeeCount, int good_State, ArrayList<String> good_Resource) {
        this.setGood_ID(good_ID);
        this.setGood_Batch(good_Batch);
        this.setGood_Name(good_Name);
        this.setGood_Price(good_Price);
        this.setGood_MadeTime(good_MadeTime);
        this.setGood_ExpireTime(good_ExpireTime);
        this.setGood_SeeCount(good_SeeCount);
        this.setGood_State(good_State);
        this.setGood_Resource(good_Resource);
    }

    public String getGood_ID() {
        return good_ID;
    }

    public void setGood_ID(String good_ID) {
        this.good_ID = good_ID;
    }

    public String getGood_Batch() {
        return good_Batch;
    }

    public void setGood_Batch(String good_Batch) {
        this.good_Batch = good_Batch;
    }

    public String getGood_Name() {
        return good_Name;
    }

    public void setGood_Name(String good_Name) {
        this.good_Name = good_Name;
    }

    public double getGood_Price() {
        return good_Price;
    }

    public void setGood_Price(double good_Price) {
        this.good_Price = good_Price;
    }

    public Date getGood_MadeTime() {
        return good_MadeTime;
    }

    public void setGood_MadeTime(Date good_MadeTime) {
        this.good_MadeTime = good_MadeTime;
    }

    public int getGood_ExpireTime() {
        return good_ExpireTime;
    }

    public void setGood_ExpireTime(int good_ExpireTime) {
        this.good_ExpireTime = good_ExpireTime;
    }

    public int getGood_SeeCount() {
        return good_SeeCount;
    }

    public void setGood_SeeCount(int good_SeeCount) {
        this.good_SeeCount = good_SeeCount;
    }

    public int getGood_State() {
        return good_State;
    }

    public void setGood_State(int good_State) {
        this.good_State = good_State;
    }

    public ArrayList<String> getGood_Resource() {
        return good_Resource;
    }

    public void setGood_Resource(ArrayList<String> good_Resource) {
        this.good_Resource = good_Resource;
    }
}
