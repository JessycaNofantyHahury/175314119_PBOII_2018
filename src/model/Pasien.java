/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class Pasien {
    
    private String Nama;
    private String Alamat;
    private String NoRekamMedis;
    private String TempatLahir;
    private int TanggalLahir;
    private int BulanLahir;
    private int TahunLahir;
    
    public Pasien (){}

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNoRekamMedis() {
        return NoRekamMedis;
    }

    public void setNoRekamMedis(String NoRekamMedis) {
        this.NoRekamMedis = NoRekamMedis;
    }
    
    
    
        
    
    
    
    
}
