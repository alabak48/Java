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
public class Zadatak6 {
    public static void main(String[] args) {
         int i = 
                Integer.parseInt(
                    JOptionPane.showInputDialog("Unesi prvi broj")
                );
        int j = 
                Integer.parseInt(
                    JOptionPane.showInputDialog("Unesi drugi broj")
                );
        int k = 
                Integer.parseInt(
                    JOptionPane.showInputDialog("Unesi drugi broj")
                );
        
        if (i < j){
            System.out.println(i);
        }else if (j < k){
            System.out.println(j);
        }else if (k < i){
            System.out.println(k);
        }else{
            System.out.println("-");
        }
        
    }
}
