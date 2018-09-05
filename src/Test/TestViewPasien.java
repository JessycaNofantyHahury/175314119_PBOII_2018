/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import View.DaftarPasienDialog;

/**
 *
 * @author admin
 */
public class TestViewPasien {
    
    public static void main(String[] args) {
        
        
        DaftarPasienDialog test = new DaftarPasienDialog("Daftar Pasien");
        test.setSize(400, 300);
        test.setVisible(true);
    }
    
}
