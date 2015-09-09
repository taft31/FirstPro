package com.huayu.taft.Model;

import java.util.Date;

/**
 * Created by taft on 15/9/8.
 */
public class User {
    private String user_ID;
    private String user_Name;
    private String user_RealName;
    private Date user_Birth;
    private String user_Image;
    private String user_Adres;
    private String user_EMail;



    public String getUser_EMail() {
        return user_EMail;
    }

    public void setUser_EMail(String user_EMail) {
        this.user_EMail = user_EMail;
    }

    private Date user_CreateDate;
    private String user_Gender;
    private String user_State;

    public User() {
    }

    public User(String user_ID, String user_Name, String user_RealName, Date user_Birth, String user_Image, String user_Adres,String user_EMail, Date user_CreateDate, String user_Gender, String user_State) {
        this.setUser_ID(user_ID);
        this.setUser_Name(user_Name);
        this.setUser_RealName(user_RealName);
        this.setUser_CreateDate(user_CreateDate);
        this.setUser_Image(user_Image);
        this.setUser_Adres(user_Adres);
        this.setUser_EMail(user_EMail);
        this.setUser_Gender(user_Gender);
        this.setUser_Birth(user_Birth);
        this.setUser_State(user_State);
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_RealName() {
        return user_RealName;
    }

    public void setUser_RealName(String user_RealName) {
        this.user_RealName = user_RealName;
    }

    public Date getUser_Birth() {
        return user_Birth;
    }

    public void setUser_Birth(Date user_Birth) {
        this.user_Birth = user_Birth;
    }

    public String getUser_Image() {
        return user_Image;
    }

    public void setUser_Image(String user_Image) {
        this.user_Image = user_Image;
    }

    public String getUser_Adres() {
        return user_Adres;
    }

    public void setUser_Adres(String user_Adres) {
        this.user_Adres = user_Adres;
    }

    public Date getUser_CreateDate() {
        return user_CreateDate;
    }

    public void setUser_CreateDate(Date user_CreateDate) {
        this.user_CreateDate = user_CreateDate;
    }

    public String getUser_Gender() {
        return user_Gender;
    }

    public void setUser_Gender(String user_Gender) {
        this.user_Gender = user_Gender;
    }

    public String getUser_State() {
        return user_State;
    }

    public void setUser_State(String user_State) {
        this.user_State = user_State;
    }
}
