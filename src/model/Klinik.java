/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author user
 */
public class Klinik {
    
     private String idklinik, nama; //attribute dari kelas Klinik yang dideklarasikan sebagai private dengan tipe data String
    
    public Klinik(){};

    public String getIdklinik() { // method untuk membaca Nilai balikan dari attribute idklinik
        return idklinik;
    }

    public void setIdklinik(String idklinik) { // method dengan parameter berupa obyek idklinik yang bertipe String 
        this.idklinik = idklinik;
    }

    public String getNama() { // method untuk membaca Nilai balikan dari attribute Nama
        return nama;
    }

    public void setNama(String nama) { //method dengan parameter berupa obyek nama yang bertipe String
        this.nama = nama;
    }
    
    
}
