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
public class Pasien extends AntrianPasien { //

    private String Nama, Alamat, TempatLahir; // attribute Nama, Alamat, Tempat Lahir yang dideklarasikan sebagai private 
    //dengan tipe data String
    private int TanggalLahir, BulanLahir, TahunLahir, NoRekamMedis;
    // attribute TanggalLahir, BulanLahir, TahunLahir, NoRekamMedis yang dideklarasikan sebagai private dengan tipe data Interger

    public Pasien() {
    }


    public String getNama() {  // method untuk membaca Nilai balikan dari attribute Nama
        return Nama;
    }

    public void setNama(String Nama) { // method dengan parameter berupa obyek Nama yang bertipe String         
        this.Nama = Nama;               //Menyimpan Nilai dari obyek Nama ke attribute Nama

    }

    public String getAlamat() { // method untuk membaca Nilai balikan dari attribute Alamat
        return Alamat;
    }

    public String getTempatLahir() { // method untuk membaca Nilai balikan dari attribute TempatLahir
        return TempatLahir;
    }

    public int getTanggalLahir() { // method untuk membaca Nilai balikan dari attribute TanggalLahir
        return TanggalLahir;
    }

    public int getBulanLahir() { // method untuk membaca Nilai balikan dari attribute BulanLahir
        return BulanLahir;
    }

    public int getTahunLahir() { // method untuk membaca Nilai balikan dari attribute TahunLahir
        return TahunLahir;
    }

    public void setAlamat(String Alamat) { // method dengan parameter berupa obyek Alamat yang bertipe String  
        this.Alamat = Alamat;               //Menyimpan Nilai dari obyek Alamat ke attribute Alamat
    }

    public int getNoRekamMedis() { // method untuk membaca Nilai balikan dari attribute NoRekamMedis
        return NoRekamMedis;
    }

    public void setNoRekamMedis(int NoRekamMedis) throws Exception { 

        //throws digunakan untuk melempar suatu eksepsi dalam program    
        // digunakan pada saat mendeklarasi suatu method.
        // method dengan parameter berupa obyek NoRekamMedis yang bertipe Integer

        if (NoRekamMedis < 21 && NoRekamMedis > 5) { // jika NoRekamMedis Kurang dari 21 dan lebih Dari 5 maka 
            this.NoRekamMedis = NoRekamMedis;       //Menyimpan Nilai dari obyek NoRekamMedis ke attribute NoRekamMedis  

        } else {// jika tidak maka sistem akan mencetak seperti berikut
            throw new Exception("No Rekam Medis Dibatas 6 - 20");
        }

    }

    public void setTempatLahir(String TempatLahir) { // method dengan parameter berupa obyek TempatLahir yang bertipe String  
        this.TempatLahir = TempatLahir;               //Menyimpan Nilai dari obyek TempatLahir ke attribute TempatLahir
    }

    public void setTanggalLahir(int TanggalLahir) throws Exception {

         //throws digunakan untuk melempar suatu eksepsi dalam program    
        // digunakan pada saat mendeklarasi suatu method.
        // method dengan parameter berupa obyek TanggalLahir yang bertipe Integer

        if (TanggalLahir > 0 && TanggalLahir <= 31) { // jika TanggalLahir lebih dari 0 dan kurang dari sama dengan 31 maka, 
            this.TanggalLahir = TanggalLahir;        //Menyimpan Nilai dari obyek TanggalLahir ke attribute TanggalLahir

        } else { // jika tidak maka sistem akan mencetak seperti berikut
            throw new Exception("Tanggal Salah...");
        }

    }

    public void setBulanLahir(int BulanLahir) throws Exception {

        //throws digunakan untuk melempar suatu eksepsi dalam program    
        // digunakan pada saat mendeklarasi suatu method.
        // method dengan parameter berupa obyek BulanLahir yang bertipe Integer

        if (BulanLahir > 0 && BulanLahir <= 12) { // jika BulanLahir lebih dari 0 dan kurang dari sama dengan 12 maka,
            this.BulanLahir = BulanLahir;        // Menyimpan Nilai dari obyek BulanLahir ke attribute BulanLahir

        } else {// jika tidak maka sistem akan mencetak seperti berikut
            throw new Exception("Bulan Salah...");
        }

    }

    public void setTahunLahir(int TahunLahir) throws Exception { 

        //throws digunakan untuk melempar suatu eksepsi dalam program    
        // digunakan pada saat mendeklarasi suatu method.
        // method dengan parameter berupa obyek TahunLahir yang bertipe Integer

        if (TahunLahir > 0) {              // jika TahunLahir lebih dari 0 maka,
            this.TahunLahir = TahunLahir;     //Menyimpan Nilai dari obyek TahunLahir ke attribute TahunLahir

        } else {// jika tidak maka sistem akan mencetak seperti berikut
            throw new Exception("Tahun Salah...");
        }

    }
}
