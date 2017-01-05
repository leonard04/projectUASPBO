/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layout;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Ignasius Leonardo
 */
public class KoneksiLogin {

    private static Connection koneksi;

    public static Connection koneksi() throws SQLException {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/itembelanja";
                String user = "root";
                String pass = "";

                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = (Connection) DriverManager.getConnection(url, user, pass);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "failed: " + e.getMessage());
            }
        }
        return koneksi;
    }
}
