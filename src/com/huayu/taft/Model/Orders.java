package com.huayu.taft.Model;

import java.util.Date;

/**
 * Created by taft on 15/9/9.
 */
public class Orders {
    private String order_ID;
    private Date order_Time;
    private String user_ID;
    private int order_State;

    public Orders() {
    }

    public Orders(String order_ID, Date order_Time, String user_ID, int order_State) {
        this.setUser_ID(user_ID);
        this.setOrder_ID(order_ID);
        this.setOrder_Time(order_Time);
        this.setOrder_State(order_State);
    }

    public String getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(String order_ID) {
        this.order_ID = order_ID;
    }

    public Date getOrder_Time() {
        return order_Time;
    }

    public void setOrder_Time(Date order_Time) {
        this.order_Time = order_Time;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public int getOrder_State() {
        return order_State;
    }

    public void setOrder_State(int order_State) {
        this.order_State = order_State;
    }
}
