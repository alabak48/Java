/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.troskovinaprojektu;

import javax.swing.JOptionPane;

/**
 *
 * @author anja0
 */
public class Unos {
    public static String unosString(String poruka) {
        String unos = "";
        while (true) {
            unos = JOptionPane.showInputDialog(poruka);
            if (unos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Neispravan unos");
                continue;
            }
            break;
        }
        return unos;
    }
    
    public static int unosInt(String poruka) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(poruka));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Neispravan unos");
            }
        }
    }
    
    public static double unosDecimal(String poruka){
          while(true){
                try {
                  return Double.parseDouble(JOptionPane.showInputDialog(poruka));
                  
              } catch (Exception e) {
                  JOptionPane.showInputDialog(null, "Unjeli ste neispravan iznos");
              }
          }
    }
    
    public static boolean unosBoolean(String poruka){
        while(true){
            try {
                return Boolean.parseBoolean(JOptionPane.showInputDialog(
                        poruka + " true ili false"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Neispravan Unos");
            }
        }
    }
}
