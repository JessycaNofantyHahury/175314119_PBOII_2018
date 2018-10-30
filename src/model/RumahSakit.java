/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author admin
 */
public class RumahSakit {

    private String nama;
    private String alamat;


    public static ArrayList<Klinik> daftarKlinik
            = new ArrayList<Klinik>();
     
    public static ArrayList<Pasien> Daftarpasien
            = new ArrayList<Pasien>();
    
   
      public static ArrayList<Klinik> daftarAntrianKlinik
            = new ArrayList<Klinik>();
      

    public static ArrayList<Pasien> getDaftarpasien() {
        return Daftarpasien;
    }

    public static void setDaftarpasien(ArrayList<Pasien> Daftarpasien) {
        RumahSakit.Daftarpasien = Daftarpasien;
    }
    
    
    public static ArrayList<Klinik> getDaftarAntrianKlinik() {
        return daftarAntrianKlinik;
    }

    public static void setDaftarAntrianKlinik(ArrayList<Klinik> daftarAntrianKlinik) {
        RumahSakit.daftarAntrianKlinik = daftarAntrianKlinik;
    }
  
        
    public RumahSakit() {
    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tambahPasien(Pasien pasien) {

    }

    public Pasien cariPasien(String NoRM) {


        for (int i = 0; i < Daftarpasien.size(); i++) {
            if (Daftarpasien.get(i).NoRekamMedis == NoRM ) {
                return Daftarpasien.get(i);
            }

        }
        return null;
    }

    

    public void tambahPasienBaru(Pasien test) {

      Daftarpasien.add(test);
    }

    public void simpanDaftarPasien(File file) 
    throws IOException{
        
       try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < Daftarpasien.size(); i++) {
                String data = Daftarpasien.get(i).toString();
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
}
    
        }
        
    

    public void bacaDaftarPasien(File file) {

         FileInputStream fis = null;
        try {
            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;
            
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    hasilBaca = hasilBaca + (char) dataInt;
                } else {
                    Pasien temp = new Pasien();
                    temp.setNama(hasilBaca);
                    tambahPasienBaru(temp);
                }
            }
            System.out.println(hasilBaca);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void simpanObjekDaftarPasien(File file) {
//
//        throws IOException{
//        
//       try {
//            FileOutputStream fos = new FileOutputStream(file);
//            for (int i = 0; i < Daftarpasien.size(); i++) {
//                String data = Daftarpasien.get(i).toString();
//                fos.write(data.getBytes());
//            }
//            fos.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
//}
    
        }
      public void bacaObjekDaftarPasien(File file) {

    }
    
      public void simpanObjekRumahSakit(File file) 
          throws IOException{
        
       try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < Daftarpasien.size(); i++) {
                String data = Daftarpasien.get(i).toString();
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
}
    
        }

    

    public void bacaObjekRumahSakit(File file) {

  FileInputStream fis = null;
        try {
            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;
            
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    hasilBaca = hasilBaca + (char) dataInt;
                } else {
                    Pasien temp = new Pasien();
                    temp.setNama(hasilBaca);
                    tambahPasienBaru(temp);
                }
            }
            System.out.println(hasilBaca);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

   
   
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }


    public void tambahKlinik(Klinik klinik) {

    }

    public void cariKlinik(String namaKLinik) {

    }

    public void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik ) {

    }
    
    public void cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik ){
        
    }
    
    public void daftarPasien(Pasien Pasien,int tanggal, int bulan, int tahun, Klinik klinik ){
        
    }
    
    public static ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public static void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        RumahSakit.daftarKlinik = daftarKlinik;
    }

    @Override
    public String toString() {
         return ""+nama+ " " +alamat+"\n";
    }
    
    

}
