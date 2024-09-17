package com.shanzhu.travel.util;

import com.shanzhu.travel.BackendApplication;
import lombok.extern.slf4j.Slf4j;
import net.jntoo.annotation.JdbcConnection;
import net.jntoo.annotation.RequestJdbcConnection;

import javax.sql.DataSource;
import java.sql.Connection;

@Slf4j
@JdbcConnection
public class QueryConnection {

    static private Connection conn = null;

    @RequestJdbcConnection
    public Connection getConnect() {
        try {
            if (conn == null || conn.isClosed()) {
                DataSource source = BackendApplication.content.getBean(DataSource.class);
                Connection connection = source.getConnection();
                conn = connection;
            }
        } catch (Exception e) {
            log.error("链接数据库出错", e);
        }
        return conn;
    }
}
