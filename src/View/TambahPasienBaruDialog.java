/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import model.Pasien;

/**
 *
 * @author admin
 */
public class TambahPasienBaruDialog extends JDialog implements ActionListener {
    
private JLabel judulLabel,namaLabel,alamatLabel,tglLahirLabel,blnLahirLabel,ThnLahirLabel,JenisKelaminLabel,NoRMLabel; 
     private JTextField namaText, AlamatText, NoLabelText;
     private JButton saveButton;
     private JComboBox tglLahir;
     private JComboBox blnLahir;
     private JComboBox thnLahir;
     private JComboBox JenisKelamin;
     private JMenuBar menuBar;

     public TambahPasienBaruDialog() {
        init();
     }
    public TambahPasienBaruDialog(String title) {
        this.setTitle(title);
        init();
    }
    public void init() {
        this.setLayout(null);
         // buat menu bar
        menuBar = new JMenuBar();
        // set Titile
        this.setTitle("TAMBAH PASIEN BARU");
        
        judulLabel = new JLabel(" PASIEN BARU ");
        judulLabel.setFont(new Font(null, Font.CENTER_BASELINE,16));
        judulLabel.setBounds(200, 5 , 200, 40);
        this.add(judulLabel);
        
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 72, 120, 20);
        this.add(namaLabel);
        
        namaText = new JTextField();
        namaText.setBounds (100,77,95,20);
        namaText.setBackground(Color.pink);
        this.add(namaText); 
        
        alamatLabel = new JLabel("Alamat ");
        alamatLabel.setBounds(20, 90, 70, 65);
        this.add(alamatLabel);
        
        AlamatText = new JTextField();
        AlamatText.setBounds (100,110,100,30);
        AlamatText.setBackground(Color.pink);
        this.add(AlamatText);
        
        tglLahirLabel = new JLabel("Tgl");
        tglLahirLabel.setBounds(20, 130, 100, 65);
        this.add(tglLahirLabel);
        
        JComboBox tglLahir = new JComboBox();
         for (int i = 1; i <=31; i++) {
           tglLahir.addItem(i);
        }
        tglLahir.setBounds(45,153,67,20);
        tglLahir.setBackground(Color.pink);
        this.add(tglLahir);
        
        blnLahirLabel = new JLabel("Bln");
        blnLahirLabel.setBounds(120, 130, 100, 65);
        this.add(blnLahirLabel);
        
        JComboBox blnLahir = new JComboBox();
        blnLahir.addItem("Jan");
        blnLahir.addItem("Feb");
        blnLahir.addItem("Mar");
        blnLahir.addItem("Apr");
        blnLahir.addItem("May");
        blnLahir.addItem("Jun");
        blnLahir.addItem("Jul");
        blnLahir.addItem("aug");
        blnLahir.addItem("Sep");
        blnLahir.addItem("Oct");
        blnLahir.addItem("Nov");
        blnLahir.addItem("Dec");
        blnLahir.setBackground(Color.pink);
        blnLahir.setBounds(149,153,67,20);
        this.add(blnLahir);
        
        ThnLahirLabel = new JLabel("Thn");
        ThnLahirLabel.setBounds(225,130,100, 65);
        this.add(ThnLahirLabel);
        
        JComboBox thnLahir = new JComboBox();
        for (int i = 1960; i <=2018; i++) {
            thnLahir.addItem(i);
        }
        thnLahir.setBackground(Color.pink);
        thnLahir.setBounds(255,153,67,20);
        this.add(thnLahir);
        
        
        
        JenisKelaminLabel = new JLabel("Jenis Kelamin");
        JenisKelaminLabel.setBounds(20, 170,100, 65);
        this.add(JenisKelaminLabel);
        
        JComboBox Jeniskelamin = new JComboBox();
        Jeniskelamin.addItem("Laki-Laki");
        Jeniskelamin.addItem("Perempuan");
        Jeniskelamin.setBounds(110,193,80,20);
        Jeniskelamin.setBackground(Color.pink);
        this.add(Jeniskelamin);
        
        NoRMLabel = new JLabel("No RM");
        NoRMLabel.setBounds(20, 210, 100, 65);
        this.add(NoRMLabel);
        
        NoLabelText = new JTextField();
        NoLabelText.setBounds(100, 235, 100, 20);
        this.add(NoLabelText);
        
        saveButton = new JButton("Simpan");
        saveButton.setBackground(Color.lightGray);
        saveButton.setBounds(220,300,80,20);
        saveButton.setSize(85, 30);
        this.add(saveButton);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            Pasien baru = new Pasien();
            baru.setNama(namaText.getText());
            baru.setAlamat(AlamatText.getText());
            baru.setNoRekamMedis(NoLabelText.getText());
         

            Pasien.tambahPasienBaru(baru);

        }

    }

}
