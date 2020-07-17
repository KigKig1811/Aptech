/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MB
 */
public class ConnecDAO {
    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;
    

    public Connection setCon() throws ClassNotFoundException, SQLException {
        String str = "jdbc:sqlserver://localhost:1433;database=RealtorsPortalSystem";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection(str, "sa", "123");
        return con;
    }

}
