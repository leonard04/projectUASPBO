/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construct;

/**
 *
 * @author Ignasius Leonardo
 */
public class Pemesan {
    private int id;
    private String nama;
    private String domisili;
    private String alamat;
    private String pesanan;
    private String no_pesanan;
    private String alamat_kirim;
    private String tgl_kirim;
    private String jml_bayar;
    private String status;

    public Pemesan() {
    }

    public Pemesan(int id, String nama, String domisili, String alamat, String pesanan, String no_pesanan, String alamat_kirim, String tgl_kirim, String jml_bayar, String status) {
        this.id = id;
        this.nama = nama;
        this.domisili = domisili;
        this.alamat = alamat;
        this.pesanan = pesanan;
        this.no_pesanan = no_pesanan;
        this.alamat_kirim = alamat_kirim;
        this.tgl_kirim = tgl_kirim;
        this.jml_bayar = jml_bayar;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDomisili() {
        return domisili;
    }

    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPesanan() {
        return pesanan;
    }

    public void setPesanan(String pesanan) {
        this.pesanan = pesanan;
    }

    public String getNo_pesanan() {
        return no_pesanan;
    }

    public void setNo_pesanan(String no_pesanan) {
        this.no_pesanan = no_pesanan;
    }

    public String getAlamat_kirim() {
        return alamat_kirim;
    }

    public void setAlamat_kirim(String alamat_kirim) {
        this.alamat_kirim = alamat_kirim;
    }

    public String getTgl_kirim() {
        return tgl_kirim;
    }

    public void setTgl_kirim(String tgl_kirim) {
        this.tgl_kirim = tgl_kirim;
    }

    public String getJml_bayar() {
        return jml_bayar;
    }

    public void setJml_bayar(String jml_bayar) {
        this.jml_bayar = jml_bayar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
