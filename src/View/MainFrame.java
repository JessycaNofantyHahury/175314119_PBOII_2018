/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author W I N D O W S 1 0
 */
import java.awt.HeadlessException;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import View.TambahPasienBaruDialog;



/**
 *
 * @author pc
 */    
    public class MainFrame extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem DaftarAntrianDialog;
    private JMenuItem TambahPasienBaruDialog;

    public MainFrame() throws HeadlessException {
        init();
    }

    public void init() {
        // buat menu bar
        menuBar = new JMenuBar();
        // set Titile
        this.setTitle("RS MUTIARA HATI");
        // buat menu
        fileMenu = new JMenu("File");
        exitMenuItem = new JMenuItem("exit");
        TambahPasienBaruDialog = new JMenuItem("TambahPasien");
        DaftarAntrianDialog = new JMenuItem("Tambah Antrian");
        fileMenu.add(TambahPasienBaruDialog);
        fileMenu.add(DaftarAntrianDialog);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        exitMenuItem.addActionListener(this);
        TambahPasienBaruDialog.addActionListener(this);
        DaftarAntrianDialog.addActionListener(this);

        this.setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
        if (e.getSource() == TambahPasienBaruDialog) {
            // nantinya diganti TambahPasienBaruDialog
            TambahPasienBaruDialog test = new TambahPasienBaruDialog();
            test.setSize(550, 400);
            test.setVisible(true);
        }
        
        if(e.getSource() == DaftarAntrianDialog){
            DaftarAntrianDialog test1 = new DaftarAntrianDialog();
            test1.setSize(550, 400);
            test1.setVisible(true);
        }
            
    }

    
}
