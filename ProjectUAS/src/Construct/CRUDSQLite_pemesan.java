/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construct;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Ignasius Leonardo
 */
public class CRUDSQLite_pemesan implements CRUDInterface_pemesan {
    private Connection konek;

    @Override
    public void bukakoneksi() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        konek = DriverManager.getConnection("jdbc:sqlite:pembeli.db");
    }

    @Override
    public void tutupkoneksi() throws SQLException {
        konek.close();
    }

    @Override
    public ArrayList<Pemesan> read() throws SQLException {
        Statement stat = konek.createStatement();
        ResultSet rs = stat.executeQuery("select * from datapembeli");
        ArrayList<Pemesan> list = new ArrayList();
        while (rs.next()) {
            Pemesan pesan = new Pemesan();
            pesan.setId(rs.getInt(1));
            pesan.setNama(rs.getString(2));
            pesan.setDomisili(rs.getString(3));
            pesan.setAlamat(rs.getString(4));
            pesan.setPesanan(rs.getString(5));
            pesan.setNo_pesanan(rs.getString(6));
            pesan.setAlamat_kirim(rs.getString(7));
            pesan.setTgl_kirim(rs.getString(8));
            pesan.setJml_bayar(rs.getString(9));
            pesan.setStatus(rs.getString(10));
            list.add(pesan);
        }
        return list;
    }

    @Override
    public Pemesan readById(int id) throws SQLException {
        PreparedStatement ps = konek.prepareStatement("select * from datapembeli where id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Pemesan pesan = new Pemesan();
        while (rs.next()) {
            pesan.setId(rs.getInt(1));
            pesan.setNama(rs.getString(2));
            pesan.setDomisili(rs.getString(3));
            pesan.setAlamat(rs.getString(4));
            pesan.setPesanan(rs.getString(5));
            pesan.setNo_pesanan(rs.getString(6));
            pesan.setAlamat_kirim(rs.getString(7));
            pesan.setTgl_kirim(rs.getString(8));
            pesan.setJml_bayar(rs.getString(9));
            pesan.setStatus(rs.getString(10));
        }
        return pesan;
    }

    @Override
    public void create(Pemesan pesan) throws SQLException {
        PreparedStatement ps = konek.prepareStatement("insert into datapembeli(nama, domisili, alamat, pesanan, no_pesanan, alamat_kirim, tanggal_kirim, jumlahbayar, status) values (?,?,?,?,?,?,?,?,?)");
        ps.setString(1, pesan.getNama());
        ps.setString(2, pesan.getDomisili());
        ps.setString(3, pesan.getAlamat());
        ps.setString(4, pesan.getPesanan());
        ps.setString(5, pesan.getNo_pesanan());
        ps.setString(6, pesan.getAlamat_kirim());
        ps.setString(7, pesan.getTgl_kirim());
        ps.setString(8, pesan.getJml_bayar());
        ps.setString(9, pesan.getStatus());
        ps.execute();
    }

    @Override
    public void delete(Pemesan pesan) throws SQLException {
        PreparedStatement ps = konek.prepareStatement("delete from datapembeli where id=?");
        ps.setInt(1, pesan.getId());
        ps.execute();
    }

    @Override
    public void update(Pemesan pesan) throws SQLException {
        String query = "update datapembeli set nama=?, domisili=?, alamat=?, pesanan=?, no_pesanan=?, alamat_kirim=?, tanggal_kirim=?, jumlahbayar=?, status=? where id=?";
        PreparedStatement ps = konek.prepareStatement(query);
        ps.setString(1, pesan.getNama());
        ps.setString(2, pesan.getDomisili());
        ps.setString(3, pesan.getAlamat());
        ps.setString(4, pesan.getPesanan());
        ps.setString(5, pesan.getNo_pesanan());
        ps.setString(6, pesan.getAlamat_kirim());
        ps.setString(7, pesan.getTgl_kirim());
        ps.setString(8, pesan.getJml_bayar());
        ps.setString(9, pesan.getStatus());
        ps.setInt(10, pesan.getId());
        ps.execute();
    }
}
