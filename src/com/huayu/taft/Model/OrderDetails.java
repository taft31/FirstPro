package com.huayu.taft.Model;

/**
 * Created by taft on 15/9/9.
 */
public class OrderDetails {
    private String order_DetailID;
    private String order_ID;
    private String good_ID;
    private int good_Count;

    public OrderDetails() {
    }

    public OrderDetails(String order_DetailID, String order_ID, String good_ID, int good_Count) {
        this.setOrder_DetailID(order_DetailID);
        this.setOrder_ID(order_ID);
        this.setGood_Count(good_Count);
        this.setGood_ID(good_ID);
    }

    public String getOrder_DetailID() {
        return order_DetailID;
    }

    public void setOrder_DetailID(String order_DetailID) {
        this.order_DetailID = order_DetailID;
    }

    public String getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(String order_ID) {
        this.order_ID = order_ID;
    }

    public String getGood_ID() {
        return good_ID;
    }

    public void setGood_ID(String good_ID) {
        this.good_ID = good_ID;
    }

    public int getGood_Count() {
        return good_Count;
    }

    public void setGood_Count(int good_Count) {
        this.good_Count = good_Count;
    }
}
