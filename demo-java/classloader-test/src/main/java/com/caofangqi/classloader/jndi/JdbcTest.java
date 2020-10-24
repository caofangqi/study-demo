package com.caofangqi.classloader.jndi;

import com.alibaba.fastjson.JSON;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;

/**
 * @author FangQi Cao
 */
public class JdbcTest {


    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://127.0.0.1:3306/stock";
        String user = "root";
        String pwd = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(url, user, pwd);
             Statement statement = connection.createStatement();
             ResultSet set = statement.executeQuery("select  * from f_stock");
        ) {

            while (set.next()) {
                System.out.print(set.getString(1));
                System.out.print(set.getString(2));
                System.out.print(set.getString(3));
                System.out.print(set.getString(4));
            }

        }
    }

}
