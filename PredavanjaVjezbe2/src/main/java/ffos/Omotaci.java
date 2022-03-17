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
public class Omotaci {
    public static void main(String[] args) {
        int i = Integer.parseInt("7");
        System.out.println(i);
        
        int j = 
                Integer.parseInt(
                    JOptionPane.showInputDialog("Unesi broj")
                );
        System.out.println(j);
    }
}

