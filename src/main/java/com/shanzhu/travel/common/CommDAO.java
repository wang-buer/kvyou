package com.shanzhu.travel.common;

import com.shanzhu.travel.util.QueryConnection;
import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 数据库操作类
 *
 * @author: ShanZhu
 * @date: 2024-01-26
 */
@Slf4j
public class CommDAO {

    /**
     * 获取链接类
     *
     * @return
     */
    static public Connection getConn() {
        return new QueryConnection().getConnect();
    }

    /**
     * 根据sql语句查询一行数据
     *
     * @param sql
     * @return
     */
    public HashMap find(String sql) {
        HashMap map = new HashMap();

        try {
            Statement st = getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            while (rs.next()) {
                int i = rsmd.getColumnCount();
                for (int j = 1; j <= i; j++) {
                    if (!rsmd.getColumnName(j).equals("ID")) {
                        String str = rs.getString(j) == null ? "" : rs.getString(j);
                        if (str.equals("null")) str = "";
                        map.put(rsmd.getColumnName(j), str);
                    } else
                        map.put("id", rs.getString(j));
                }
                break;
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            log.error("sql 异常", e);
        }
        return map;
    }

    /**
     * 执行sql
     *
     * @param sql
     * @return
     */
    public long commOper(String sql) {
        long autoInsertId = -1;
        try {
            Statement st = getConn().createStatement();
            st.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = st.getGeneratedKeys();
            while (rs.next()) {
                autoInsertId = rs.getLong(1);
            }
            rs.close();
            st.close();
            System.out.println(sql);
        } catch (SQLException e) {
            log.error("sql 异常",e);
        }
        return autoInsertId;
    }


    /**
     * @param sql
     * @return
     */
    public List<HashMap> select(String sql) {
        List<HashMap> list = new ArrayList();
        try {
            Statement st = getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                HashMap map = new HashMap();
                int i = rsmd.getColumnCount();
                for (int j = 1; j <= i; j++) {
                    if (!rsmd.getColumnName(j).equals("ID")) {
                        String str = rs.getString(j) == null ? "" : rs.getString(j);
                        if (str.equals("null")) str = "";
                        map.put(rsmd.getColumnName(j), str);
                    } else
                        map.put("id", rs.getString(j));
                }
                list.add(map);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            if (sql.equals("show tables"))
                list = select("select table_name from   INFORMATION_SCHEMA.tables");
            else {
                log.error("sql 异常",e);
            }
        }
        return list;
    }
}
