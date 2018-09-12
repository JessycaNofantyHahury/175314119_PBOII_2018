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
public class DaftarAntrianDialog extends JDialog {

    private JLabel JudulLabel;
    private JLabel NamaLabel;
    private JLabel Alamat;
    private JLabel NoRM;
    private JTextField namaText;
    private JTextField NoRMText;
    private JTextField AlamatText;
    private JButton saveButton;

    public DaftarAntrianDialog() {
        init();
    }

    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);

        JudulLabel = new JLabel("Tambah Antri");
        JudulLabel.setBounds(140, 30, 100, 20);

        this.add(JudulLabel);
        NamaLabel = new JLabel("No RM ");
        NamaLabel.setBounds(50, 70, 70, 80);
        this.add(NamaLabel);

        NoRM = new JLabel("NoRM");
        NoRM.setBounds(50, 50, 50, 50);
        this.add(NoRM);

        Alamat = new JLabel("Alamat ");
        Alamat.setBounds(50, 60, 60, 180);
        this.add(Alamat);

        saveButton = new JButton("Simpan");
        saveButton.setBounds(145, 200, 80, 20);
        this.add(saveButton);

        this.setLayout(null);
        NoRMText = new JTextField();
        NoRMText.setBounds(100, 70, 80, 20);
        this.add(NoRMText);

        this.setLayout(null);
        namaText = new JTextField();
        namaText.setBounds(100, 100, 80, 20);
        this.add(namaText);

        this.setLayout(null);
        AlamatText = new JTextField();
        AlamatText.setBounds(100, 140, 80, 20);
        this.add(AlamatText);
    }
}
