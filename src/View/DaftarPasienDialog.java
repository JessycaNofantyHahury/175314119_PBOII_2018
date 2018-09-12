/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class DaftarPasienDialog extends JDialog {

    private JLabel JudulLabel;
    private JLabel NamaLabel;
    private JLabel Alamat;
    private JLabel TTL;
    private JTextField namaText;
    private JTextField AlamatText;
    private JTextField TTLText;
    private JButton saveButton;

    public DaftarPasienDialog() {
        init();
    }

    public DaftarPasienDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {

        JudulLabel = new JLabel("DAFTAR PASIEN BARU");
        JudulLabel.setBounds(130, 30, 100, 20);
        this.add(JudulLabel);

        this.setLayout(null);
        NamaLabel = new JLabel("Nama ");
        NamaLabel.setBounds(50, 70, 70, 80);
        this.add(NamaLabel);

        Alamat = new JLabel("Alamat ");
        Alamat.setBounds(50, 60, 60, 180);
        this.add(Alamat);

        Alamat = new JLabel("TTL ");
        Alamat.setBounds(50, 90, 90, 180);
        this.add(Alamat);

        this.setLayout(null);
        namaText = new JTextField();
        namaText.setBounds(100, 100, 80, 20);
        this.add(namaText);

        this.setLayout(null);
        AlamatText = new JTextField();
        AlamatText.setBounds(100, 140, 80, 20);
        this.add(AlamatText);

        this.setLayout(null);
        TTLText = new JTextField();
        TTLText.setBounds(100, 170, 80, 20);
        this.add(TTLText);

        saveButton = new JButton("Simpan");
        saveButton.setBounds(145, 200, 80, 20);
        this.add(saveButton);

    }

}
