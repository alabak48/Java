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
public class Zadatak6 {
    // Program od korisnika unosi tri cijela broja
    // Program ispisuje najmanji uneseni broj

    public static void main(String[] args) {
        int i
                = Integer.parseInt(
                        JOptionPane.showInputDialog("Unesite 1. broj"));
        int j
                = Integer.parseInt(
                        JOptionPane.showInputDialog("Unesite 2. broj"));
        int k
                = Integer.parseInt(
                        JOptionPane.showInputDialog("Unesite 3. broj"));

        if (i < j && i < k) {
            System.out.println(i);
        } else if (j < k) {
            System.out.println(j);
        } else {
            System.out.println(k);
        }
    }
}
