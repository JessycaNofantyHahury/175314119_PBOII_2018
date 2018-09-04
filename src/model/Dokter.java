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
public class Dokter {

    private String noPegawai; //attribute noPegawai yang dideklarasikan sebagai private dengan tipe data String
    private String nama; //attribute nama yang dideklarasikan sebagai private dengan tipe data String
    private String alamat; //attribute alamat  yang dideklarasikan sebagai private dengan tipe data String
    private String tempatLahir; //attribute tempatLahir yang dideklarasikan sebagai private dengan tipe data String
    private int tanggalLahir; //attribute tanggalLahir yang dideklarasikan sebagai private dengan tipe data integer

    public String getNoPegawai() { // method untuk membaca Nilai balikan dari attribute noPegawai
        return noPegawai;
    }

    public void setNoPegawai(String noPegawai) { // method dengan parameter berupa obyek noPegawai yang bertipe String
        this.noPegawai = noPegawai;
    }

    public String getNama() { // method untuk membaca Nilai balikan dari attribute nama
        return nama;
    }

    public void setNama(String nama) { // method dengan parameter berupa obyek nama yang bertipe String
        this.nama = nama;
    }

    public String getAlamat() { // method untuk membaca Nilai balikan dari attribute alamat
        return alamat;
    }

    public void setAlamat(String alamat) { // method dengan parameter berupa obyek alamat yang bertipe String
        this.alamat = alamat;
    }

    public String getTempatLahir() { // method untuk membaca Nilai balikan dari attribute tempatLahir
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) { // method dengan parameter berupa obyek tempatLahir yang bertipe String
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() { //method untuk membaca Nilai balikan dari attribute tanggalLahir
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) { // method dengan parameter berupa obyek tanggalLahir yang bertipe integer
        this.tanggalLahir = tanggalLahir;
    }

}
