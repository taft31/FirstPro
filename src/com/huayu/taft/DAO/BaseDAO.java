package com.huayu.taft.DAO;

import java.sql.*;

/**
 * Created by taft on 15/9/8.
 */
public class BaseDAO {
    private final String Driver = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/FirstPro";
    private final String Name = "root";
    private final String Pass = "java";
    private Connection conn = null;
    private PreparedStatement prestat = null;
    private ResultSet rs = null;
    public Connection getConn(){
        try {
            Class.forName(Driver);
            conn = DriverManager.getConnection(URL, Name, Pass);
            return conn;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean doQuery(String sql,Object...param){
        conn = getConn();
        try {
            prestat = conn.prepareStatement(sql);
            for (int i = 0; i < param.length; i++) {
                prestat.setObject((i+1),param[i]);
            }
            rs = prestat.executeQuery();
            while (rs.next()){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll();
        }
        return false;
    }
    public boolean doUpdate(String sql,Object...param){
        conn = getConn();
        try {
            prestat = conn.prepareStatement(sql);
            for (int i = 0; i < param.length; i++) {
                prestat.setObject((i+1),param[i]);
            }
            int rows = prestat.executeUpdate();
            if(0!=rows){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll();
        }
        return false;
    }

    public void closeAll(){
        if(null!=conn){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (null!=prestat){
            try {
                prestat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (null!=rs){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
