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
public class Zadatak2 {

    // Program od korisnika učitava dva cijela broja
    // Ispisuje veći
    public static void main(String[] args) {
        int i
                = Integer.parseInt(
                        JOptionPane.showInputDialog("Unesi prvi broj")
                );
        int j
                = Integer.parseInt(
                        JOptionPane.showInputDialog("Unesi drugi broj")
                );

        if (i > j) {
            System.out.println(i);
        } else if (i < j) {
            System.out.println(j);
        } else {
            System.out.println("Broj koji ste unjeli ne može biti isti");
        }
    }
}
