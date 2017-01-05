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
public class Barang {
    private int id;
    private String nama;
    private String merk;
    private String asal_brg;
    private String pt_impor;
    private String pt_ekspor;
    private String no_impor;
    private String no_ekspor;
    private String harga;
    private String jml_brg;

    public Barang() {
    }

    public Barang(int id, String nama, String merk, String asal_brg, String pt_impor, String pt_ekspor, String no_impor, String no_ekspor, String harga, String jml_brg) {
        this.id = id;
        this.nama = nama;
        this.merk = merk;
        this.asal_brg = asal_brg;
        this.pt_impor = pt_impor;
        this.pt_ekspor = pt_ekspor;
        this.no_impor = no_impor;
        this.no_ekspor = no_ekspor;
        this.harga = harga;
        this.jml_brg = jml_brg;
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

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getAsal_brg() {
        return asal_brg;
    }

    public void setAsal_brg(String asal_brg) {
        this.asal_brg = asal_brg;
    }

    public String getPt_impor() {
        return pt_impor;
    }

    public void setPt_impor(String pt_impor) {
        this.pt_impor = pt_impor;
    }

    public String getPt_ekspor() {
        return pt_ekspor;
    }

    public void setPt_ekspor(String pt_ekspor) {
        this.pt_ekspor = pt_ekspor;
    }

    public String getNo_impor() {
        return no_impor;
    }

    public void setNo_impor(String no_impor) {
        this.no_impor = no_impor;
    }

    public String getNo_ekspor() {
        return no_ekspor;
    }

    public void setNo_ekspor(String no_ekspor) {
        this.no_ekspor = no_ekspor;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJml_brg() {
        return jml_brg;
    }

    public void setJml_brg(String jml_brg) {
        this.jml_brg = jml_brg;
    }
    
    
    
    
}
