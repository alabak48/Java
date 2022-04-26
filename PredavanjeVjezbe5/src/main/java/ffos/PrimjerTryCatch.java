/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import javax.swing.JOptionPane;

/**
 *
 * @author Korisnik
 */
public class PrimjerTryCatch {

    public static void main(String[] args) {

        try {
            int[] niz = {1, 2};
            System.out.println(niz[2]);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int b;
        while (true) {
            try {
                   b =Integer.parseInt(JOptionPane.showInputDialog("Daj broj!"));
                   break;
            } catch (Exception e) {
                    JOptionPane.showInputDialog(null, "Nije broj");
                            
            }
        }
        System.out.println(b);
    }
}
