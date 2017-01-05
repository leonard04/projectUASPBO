/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construct;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ignasius Leonardo
 */
public interface CRUDInterface_barang {
    public void bukakoneksi() throws ClassNotFoundException, SQLException;
    public void tutupkoneksi() throws SQLException;
    public ArrayList<Barang> read() throws SQLException;
    public Barang readById(int id) throws SQLException;
    public void create (Barang barang) throws SQLException;
    public void delete (Barang barang) throws SQLException;
    public void update (Barang barang) throws SQLException;
}
