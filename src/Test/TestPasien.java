/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;


import model.Dokter;
import model.Klinik;
import model.Pasien;



/**
 *
 * @author admin
 */
public class TestPasien {

    public static void main(String[] args) throws Exception {
     
        Pasien pasien = new Pasien();
        //* membuat objek baru dari kelas Pasien yang dideklarasikan dengan nama  Pasien
        Dokter doc = new Dokter();
        // membuat objek baru dari kelas Dokter yang dideklarasikan dengan nama  doc
        Klinik klnk = new Klinik();
       // membuat objek baru dari kelas Klinik yang dideklarasikan dengan nama kl

        pasien.setNoRekamMedis(7);
        //* input nilai 7 sebagai parameter dari menthod setnoRekamMedis() yang dijalankan oleh objek pas dari kelas Pasien
        pasien.setAlamat("Jl. SD Percobaan, no.25 Rt 3 Rw 3");
        //* input keterangan berupa "jl. sesama, no.1 Rt 2 Rw 3" yang digunakan sebagai parameter menthod setAlamat() yang dijalankan objek pasien daeri kelas pasien
        pasien.setBulanLahir(1);
        /* input nilai 11 sebagai parameter dari menthod setBulanLAhir() yang dijalankan oleh objek pasien dari kelas Pasien*/
        pasien.setNama("Jessyca Hahury");
        /* input keterangan berupa "parjo" yang digunakan sebagai parameter menthod setNamat() yang dijalankan objek pasien dari kelas pasien*/

        pasien.setTanggalLahir(25);
        /* input nilai 2 sebagai parameter dari menthod setTanggalLahir() yang dijalankan oleh objek pasien dari kelas Pasien*/
        pasien.setTempatLahir("Wamena");
        /* input keterangan berupa "jayapura" yang digunakan sebagai parameter menthod setTempatLahir() yang dijalankan objek pasien dari kelas pasien*/
        pasien.setTahunLahir(2000);
        /* input nilai 1999 sebagai parameter dari menthod settahunLahir() yang dijalankan oleh objek pasien dari kelas Pasien*/

        klnk.setIdklinik("0122.5787.2900");
        /* input keterangan berupa "0021.5567.2280" yang digunakan sebagai parameter menthod setidklinik() yang dijalankan objek kl dari kelas Klinik*/
        klnk.setNama("HARAPAN");
        /* input keterangan berupa "berguna berguna" yang digunakan sebagai parameter menthod setnama() yang dijalankan objek kl dari kelas Klinik*/
        pasien.setTanggal_antrian(10);
        /* input nilai  17 yang digunakan sebagai parameter menthod settanggalAntrian() yang dijalankan objek pasien dari kelas Pasien*/

        pasien.setBulan_antrian(8);
        /* input nilai 9 yang digunakan sebagai parameter menthod setbulanAntrian() yang dijalankan objek pasien dari kelas Pasien*/
        pasien.setTahun_antrian(2017);
        /* input nilai 2015 yang digunakan sebagai parameter menthod settahunAntrian() yang dijalankan objek pasien dari kelas Pasien*/
        pasien.setKlinik(klnk);
        /* input nilai dari objek kl yang digunakan sebagai parameter menthod SetKLinik() yang dijalankan objek pasien dari kelas Pasien*/

        doc.setNama("Jimmy");
        /* input keterangan berupa "Yohanes" yang digunakan sebagai parameter menthod setnama() yang dijalankan objek doc dari kelas Dokter*/
        doc.setAlamat("Waena");
        /* input keterangan berupa "Abepura" yang digunakan sebagai parameter menthod setalamat() yang dijalankan objek doc dari kelas Dokter*/
        doc.setNoPegawai("17531411900");
        /* input keterangan berupa "1223434" yang digunakan sebagai parameter menthod setnoPegawai() yang dijalankan objek doc dari kelas Dokter*/
        doc.setTempatLahir("Jakarta");
        /* input keterangan berupa "Surabaya" yang digunakan sebagai parameter menthod settempatlahir() yang dijalankan objek doc dari kelas Dokter*/
        doc.setTanggalLahir(25);
        /* input nilai 13 yang digunakan sebagai parameter menthod settanggalLahir() yang dijalankan objek doc dari kelas Dokter*/

        System.out.println("\t\t\t KLINIK " + klnk.getNama());
        // cetak dan panggil menthod getnama yang dijalakan objek kl
        System.out.println("\t\t       Id:" + klnk.getIdklinik());
        // cetak dan panggil menthod getidklinik yang dijalankan oleh objek kl
        System.out.println("\t\t==============================");
        System.out.println("");
        //
        System.out.println("\t\t   DATA PASIEN ");
        System.out.println("");
        // 
        System.out.println("No Rekam Medis\t        :   " + pasien.getNoRekamMedis());
        // cetak "nomor rekam medis" dan panggil menthod getnoRekamMedis() yg tlah dijalankan oleh objek pasien
        // cetak "nama" dan panggil menthod getnama() yang telah dijalankan oleh objek pasien
        System.out.println("Alamat            \t:   " + pasien.getAlamat());
        // cetak "alamat" dan panggil menthod getAlamat()

        System.out.print("Tempat Tanggal Lahir\t:   " + pasien.getTempatLahir());
        // cetak "tempat tanggal lahir" lalu panggil menthod getTempatLahir()
        System.out.print("," + pasien.getTanggalLahir());
        System.out.print("/" + pasien.getBulanLahir());
        System.out.println("/" + pasien.getTahunLahir());
        System.out.print("Tanggal Antrian     \t:   " + pasien.getTanggal_antrian());
        System.out.print("/" + pasien.getBulan_antrian());
        System.out.println("/" + pasien.getTahun_antrian());
//      cetak berupa keterangan dan panggil menthod dari kelas Pasien dan turunan AntrianPasien yang telah dijalakan oleh objek pas
        System.out.println("");
        
        System.out.println("\t\t     DOKTER");
        System.out.println("");
        System.out.println("Nama\t  :   " + doc.getNama()); 
     // cetak "Nama" lalu panggil menthod getNama yang dijalankan oleh objek doc()
        System.out.println("NIP  \t  :   " + doc.getNoPegawai());
     // cetak "NIP" lalu panggil menthod getNoPegawai yang dijalankan oleh objek doc()
        System.out.println("TTL \t  :   " + doc.getTempatLahir());
     // cetak "TTL" lalu panggil menthod getTempatLahir yang dijalankan oleh objek doc()
        System.out.println("");
    }
        
       
    }
        
    
    

