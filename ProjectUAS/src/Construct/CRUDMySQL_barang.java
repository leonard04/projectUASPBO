/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construct;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Ignasius Leonardo
 */
public class CRUDMySQL_barang implements CRUDInterface_barang {

    private Connection konek;

    @Override
    public void bukakoneksi() throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        konek = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/itembelanja", "root", "");
    }

    @Override
    public void tutupkoneksi() throws SQLException {
        konek.close();
    }

    @Override
    public ArrayList<Barang> read() throws SQLException {
        Statement stat = konek.createStatement();
        ResultSet rs = stat.executeQuery("select * from itembelanja.barang");
        ArrayList<Barang> list = new ArrayList();
        while (rs.next()) {
            Barang brg = new Barang();
            brg.setId(rs.getInt(1));
            brg.setNama(rs.getString(2));
            brg.setMerk(rs.getString(3));
            brg.setAsal_brg(rs.getString(4));
            brg.setPt_impor(rs.getString(5));
            brg.setPt_ekspor(rs.getString(6));
            brg.setNo_impor(rs.getString(7));
            brg.setNo_ekspor(rs.getString(8));
            brg.setHarga(rs.getString(9));
            brg.setJml_brg(rs.getString(10));
            list.add(brg);
        }
        return list;
    }

    @Override
    public Barang readById(int id) throws SQLException {
        PreparedStatement ps = konek.prepareStatement("select * from itembelanja.barang where id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Barang barang = new Barang();
        while (rs.next()) {
            barang.setId(rs.getInt(1));
            barang.setNama(rs.getString(2));
            barang.setMerk(rs.getString(3));
            barang.setAsal_brg(rs.getString(4));
            barang.setPt_impor(rs.getString(5));
            barang.setPt_ekspor(rs.getString(6));
            barang.setNo_impor(rs.getString(7));
            barang.setNo_ekspor(rs.getString(8));
            barang.setHarga(rs.getString(9));
            barang.setJml_brg(rs.getString(10));
        }
        return barang;
    }

    @Override
    public void create(Barang barang) throws SQLException {
        String query = "insert into itembelanja.barang(nama, merk, asal_brg, perusahaan_import, perusahaan_eksport, no_import, no_eksport, harga, jml_awal_item) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = konek.prepareStatement(query);
        ps.setString(1, barang.getNama());
        ps.setString(2, barang.getMerk());
        ps.setString(3, barang.getAsal_brg());
        ps.setString(4, barang.getPt_impor());
        ps.setString(5, barang.getPt_ekspor());
        ps.setString(6, barang.getNo_impor());
        ps.setString(7, barang.getNo_ekspor());
        ps.setString(8, barang.getHarga());
        ps.setString(9, barang.getJml_brg());
        ps.execute();
    }

    @Override
    public void delete(Barang barang) throws SQLException {
        PreparedStatement ps = konek.prepareStatement("delete from itembelanja.barang where id=?");
        ps.setInt(1, barang.getId());
        ps.execute();
    }

    @Override
    public void update(Barang barang) throws SQLException {
        String query = "update itembelanja.barang set nama=?, merk=?, asal_brg=?, perusahaan_import=?, perusahaan_eksport=?, no_import=?, no_eksport=?, harga=?, jml_awal_item=? where id=?";
        PreparedStatement ps = konek.prepareStatement(query);
        ps.setString(1, barang.getNama());
        ps.setString(2, barang.getMerk());
        ps.setString(3, barang.getAsal_brg());
        ps.setString(4, barang.getPt_impor());
        ps.setString(5, barang.getPt_ekspor());
        ps.setString(6, barang.getNo_impor());
        ps.setString(7, barang.getNo_ekspor());
        ps.setString(8, barang.getHarga());
        ps.setString(9, barang.getJml_brg());
        ps.setInt(10, barang.getId());
        ps.execute();
    }

}
