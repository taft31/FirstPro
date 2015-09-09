package com.huayu.taft.Model;

import java.util.Date;

/**
 * Created by taft on 15/9/9.
 */
public class Comment {
    private String comment_ID;
    private Date comment_Date;
    private String comment_context;
    private String user_ID;
    private String good_ID;

    public Comment() {
    }

    public Comment(String comment_ID, Date comment_Date, String comment_context, String user_ID, String good_ID) {
        this.setUser_ID(user_ID);
        this.setComment_context(comment_context);
        this.setComment_Date(comment_Date);
        this.setGood_ID(good_ID);
        this.setComment_ID(comment_ID);
    }

    public String getComment_ID() {
        return comment_ID;
    }

    public void setComment_ID(String comment_ID) {
        this.comment_ID = comment_ID;
    }

    public Date getComment_Date() {
        return comment_Date;
    }

    public void setComment_Date(Date comment_Date) {
        this.comment_Date = comment_Date;
    }

    public String getComment_context() {
        return comment_context;
    }

    public void setComment_context(String comment_context) {
        this.comment_context = comment_context;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public String getGood_ID() {
        return good_ID;
    }

    public void setGood_ID(String good_ID) {
        this.good_ID = good_ID;
    }
}
