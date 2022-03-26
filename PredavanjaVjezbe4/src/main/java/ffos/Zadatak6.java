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
       int broj; 
       while(true)  {
               broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
               if(broj==5){
               continue;
               }else{
               System.out.println("Osijek");
               break;
    }
        
      }
    }
}
