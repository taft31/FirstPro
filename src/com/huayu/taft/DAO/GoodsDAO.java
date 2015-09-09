package com.huayu.taft.DAO;

import com.huayu.taft.DTO.GoodsDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by taft on 15/9/9.
 */
public class GoodsDAO extends BaseDAO {
    private Connection conn = null;
    private PreparedStatement prestat = null;
    private ResultSet rs = null;

    public GoodsDTO showGoods(String good_ID){
        conn = getConn();
        String sql = "select ";

        return null;
    }
}
