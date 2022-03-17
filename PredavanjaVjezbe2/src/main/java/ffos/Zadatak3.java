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
public class Zadatak3 {
    // program od korisnika učitava cijeli broj
    // te ispisuje da li je učitani broj paran ili ne
    public static void main(String[] args) {
    int i = 
            Integer.parseInt(
                    JOptionPane.showInputDialog("Unesi broj")
            );
    
   if ( i % 2 == 0 )
        System.out.println("Paran broj");
     else
        System.out.println("Neparan broj");
  }        
          
}     
    
   
