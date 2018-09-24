/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Pasien {

    //String Nama;

    public String Nama,Alamat, TempatLahir, nik, NoRekamMedis; // attribute Nama, Alamat, Tempat Lahir yang dideklarasikan sebagai private 
    //dengan tipe data String
    private int TanggalLahir, BulanLahir, TahunLahir;
    // attribute TanggalLahir, BulanLahir, TahunLahir, NoRekamMedis yang dideklarasikan sebagai private dengan tipe data Interge
    public static ArrayList<Pasien> daftarPasienKlinik
            = new ArrayList<Pasien>();

    public static void tambahPasienBaru(Pasien pasien) {

        daftarPasienKlinik.add(pasien);
    }

    public static Pasien cariPasien(String string) {

        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (daftarPasienKlinik.get(i).NoRekamMedis == string) {
                return daftarPasienKlinik.get(i);
            }

        }
        return null;
    }
    
    public Pasien(String Nama, String Alamat, String TempatLahir, int TanggalLahir, int BulanLahir, int TahunLahir, String nik) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.TempatLahir = TempatLahir;
        this.TanggalLahir = TanggalLahir;
        this.BulanLahir = BulanLahir;
        this.TahunLahir = TahunLahir;
        this.nik = nik;
    }

   public Pasien(){}

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public void setTahunLahir(int TahunLahir) {
        this.TahunLahir = TahunLahir;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public int getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(int TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    public int getBulanLahir() {
        return BulanLahir;
    }

    public void setBulanLahir(int BulanLahir) {
        this.BulanLahir = BulanLahir;
    }

    public void setNoRekamMedis(String noRekamMedis) throws NumberFormatException {
        if (NoRekamMedis.toCharArray().length >= 6) {
            this.NoRekamMedis = noRekamMedis;
        } else {
            throw new NumberFormatException("Nomor Rekam Medis Salah");
        }
    }

    public void setTempatLahir(String TempatLahir) { // method dengan parameter berupa obyek TempatLahir yang bertipe String  
        this.TempatLahir = TempatLahir;               //Menyimpan Nilai dari obyek TempatLahir ke attribute TempatLahir
    }

//    public void setTanggalLahir(int TanggalLahir) throws Exception {
//
//        //throws digunakan untuk melempar suatu eksepsi dalam program    
//        // digunakan pada saat mendeklarasi suatu method.
//        // method dengan parameter berupa obyek TanggalLahir yang bertipe Integer
//        if (TanggalLahir > 0 && TanggalLahir <= 31) { // jika TanggalLahir lebih dari 0 dan kurang dari sama dengan 31 maka, 
//            this.TanggalLahir = TanggalLahir;        //Menyimpan Nilai dari obyek TanggalLahir ke attribute TanggalLahir
//
//        } else { // jika tidak maka sistem akan mencetak seperti berikut
//            throw new Exception("Tanggal Salah...");
//        }
//
//    }
//    public void setBulanLahir(int BulanLahir) throws Exception {
//
//        //throws digunakan untuk melempar suatu eksepsi dalam program    
//        // digunakan pada saat mendeklarasi suatu method.
//        // method dengan parameter berupa obyek BulanLahir yang bertipe Integer
//        if (BulanLahir > 0 && BulanLahir <= 12) { // jika BulanLahir lebih dari 0 dan kurang dari sama dengan 12 maka,
//            this.BulanLahir = BulanLahir;        // Menyimpan Nilai dari obyek BulanLahir ke attribute BulanLahir
//
//        } else {// jika tidak maka sistem akan mencetak seperti berikut
//            throw new Exception("Bulan Salah...");
//        }
//
//    }
//    public void setTahunLahir(int TahunLahir) throws Exception {
//
//        //throws digunakan untuk melempar suatu eksepsi dalam program    
//        // digunakan pada saat mendeklarasi suatu method.
//        // method dengan parameter berupa obyek TahunLahir yang bertipe Integer
//        if (TahunLahir > 0) {              // jika TahunLahir lebih dari 0 maka,
//            this.TahunLahir = TahunLahir;     //Menyimpan Nilai dari obyek TahunLahir ke attribute TahunLahir
//
//        } else {// jika tidak maka sistem akan mencetak seperti berikut
//            throw new Exception("Tahun Salah...");
//        }
//
//    }
    public String getTempatLahir() {
        return TempatLahir;
    }

    public int getTahunLahir() {
        return TahunLahir;
    }

    public String getNoRekamMedis() {
        return NoRekamMedis;
    }

}
