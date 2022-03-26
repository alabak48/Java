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
public class Zadatak10 {
    public static void main(String[] args) {
        
        int suma=0;
        
        while(true){
        i=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
        if(i==-1){
        break;}
        suma+=i;}
        System.out.println(suma);
    }
            
}
