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
public class Zadatak4 {
    public static void main(String[] args) {
       int i = 
            Integer.parseInt(
                    JOptionPane.showInputDialog("Unesi broj")
            );
       
       switch (i){
           case 5:
               System.out.println("Primljeno");
               break;
           case 7:
               System.out.println("Primljeno");
               break;
           case 9:
               System.out.println("Primljeno");
               break;
           case 11:
               System.out.println("Primljeno");
               break;
           default:
               System.out.println("Nešto");
       }
    }
}
