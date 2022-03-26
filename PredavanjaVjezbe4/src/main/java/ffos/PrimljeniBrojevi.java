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
public class PrimljeniBrojevi {

    public static void main(String[] args) {
        int i
                = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj")
                );

        int j
                = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj")
                );

        int k
                = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj")
                );

        if (i > j && i > k) {
            System.out.println(i);
        } else if (j > k) {
            System.out.println(j);
        } else {
            System.out.println(k);
        }
    }
}
