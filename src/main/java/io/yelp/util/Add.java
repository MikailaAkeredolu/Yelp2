package io.yelp.util;

import java.sql.*;

/**
 * Created by mikailaakeredolu on 7/5/16.
 */
public class Add {

    public static void addValue(String name, String mobile_URL, String phone, String rating, String reviewCount, String isClose) throws ClassNotFoundException, SQLException
    {
        int id = 0;
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yelpDB3?autoReconnect=true&useSSL=false","root","");

        Statement statement = con.createStatement();
        String query = "select * from business order by business_id desc limit 1";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            id = resultSet.getInt("business_id");
        }
        PreparedStatement update = con.prepareStatement
                ("insert into business values(?,?,?,?,?,?,?)");
        update.setInt(1,(id+1));
        update.setString(2, isClose);
        update.setString(3,mobile_URL);
        update.setString(4, name);
        update.setString(5, phone);
        update.setString(6, rating);
        update.setString(7, reviewCount);
        update.executeUpdate();
    }
}
