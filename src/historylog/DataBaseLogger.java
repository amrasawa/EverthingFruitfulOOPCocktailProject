/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package historylog;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author عسثق
 */
public class DataBaseLogger implements Logger{

    //joining to dataBase
    String url = "jdbc:mysql://localhost:3306/cocktaildatabase";
    String username = "root";
    String password = "";

    @Override
    public void log(String msg)  {

        String insertSql = "INSERT INTO myhistory (info) VALUES(" + "\"" + msg + "\"" + ")";

        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(DataBaseLogger.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection conn = DriverManager.getConnection(url, username, password);
//            Statement statement = conn.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from history");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2));
//            }
            PreparedStatement preparedStmt = conn.prepareStatement(insertSql);
            preparedStmt.execute();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}