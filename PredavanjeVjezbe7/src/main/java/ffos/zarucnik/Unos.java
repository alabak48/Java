/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.zarucnik;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Korisnik
 */
public class Unos {
    public static String unosString(String poruka){
        String unos = ""; 
        while(true){
            unos = JOptionPane.showInputDialog(poruka);
            if(unos.isEmpty()){
                JOptionPane.showInputDialog(null, "Neispravan unos");
            continue;
        }
        break;
        }
        /*
        ulaz.close();
        */
        return unos;

    }
    
    public static int unosInt(String poruka){
    while(true){
        try {
            return Integer.parseInt(JOptionPane.showInputDialog(poruka));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Neispravan unos");
        }
    }
   
    }
    
    public static boolean unosBoolean(String poruka){
        while(true){
            try {
                return Boolean.parseBoolean(JOptionPane.showInputDialog(poruka + "True ili False"));
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Neispravan Unos");
            }
        }
    
    }
    
    public static double unosDouble(String poruka){
    while(true){
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(poruka + ". za decimalni dio"));
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Neispravan Unos");
            }
        }
    }
}




