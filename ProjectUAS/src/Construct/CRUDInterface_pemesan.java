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
public interface CRUDInterface_pemesan {
    public void bukakoneksi() throws ClassNotFoundException, SQLException;
    public void tutupkoneksi() throws SQLException;
    public ArrayList<Pemesan> read() throws SQLException;
    public Pemesan readById(int id) throws SQLException;
    public void create (Pemesan pesan) throws SQLException;
    public void delete (Pemesan pesan) throws SQLException;
    public void update (Pemesan pesan) throws SQLException;
}
