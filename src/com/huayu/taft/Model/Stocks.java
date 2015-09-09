package com.huayu.taft.Model;

/**
 * Created by taft on 15/9/9.
 */
public class Stocks {
    private String stock_ID;
    private String good_ID;
    private int good_Batch;
    private int good_Count;

    public Stocks() {
    }

    public Stocks(String stock_ID, String good_ID, int good_Batch, int good_Count) {
        this.setStock_ID(stock_ID);
        this.setGood_ID(good_ID);
        this.setGood_Count(good_Count);
        this.setGood_Batch(good_Batch);
    }

    public String getStock_ID() {
        return stock_ID;
    }

    public void setStock_ID(String stock_ID) {
        this.stock_ID = stock_ID;
    }

    public String getGood_ID() {
        return good_ID;
    }

    public void setGood_ID(String good_ID) {
        this.good_ID = good_ID;
    }

    public int getGood_Batch() {
        return good_Batch;
    }

    public void setGood_Batch(int good_Batch) {
        this.good_Batch = good_Batch;
    }

    public int getGood_Count() {
        return good_Count;
    }

    public void setGood_Count(int good_Count) {
        this.good_Count = good_Count;
    }
}
