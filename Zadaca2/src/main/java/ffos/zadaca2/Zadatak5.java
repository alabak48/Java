/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.zadaca2;

import javax.swing.JOptionPane;

/**
 *
 * @author anja0
 */
public class Zadatak5 {
    // Ukoliko je rezultat množenja dva cijela broja
    // (koja je korisnik unio)
    // veći od 100 ispiši DA, inače ispiši NE

    public static void main(String[] args) {

        int i
                = Integer.parseInt(
                        JOptionPane.showInputDialog("Unesi broj")
                );
        int j
                = Integer.parseInt(
                        JOptionPane.showInputDialog("Unesi broj")
                );

        if (i * j >= 100) {
            System.out.println("Da");
        } else{
            System.out.println("Ne");
        }
    }
}
