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
public class RadSMetodama {

    // konstruktor
    // može i ne mora primati parametre
    //ne varaća vrijednost a nije tipa void
    public RadSMetodama() {
        //1. tip
        nePrimaParametreNeVracaVrijednost();
        //2.
        primaParametreNeVracaVrijednost(7);
        primaParametreNeVracaVrijednost(7, 8);
        //tip 3.
        System.out.println(nePrimaParamtreVracaVrijednost());
        //tip 4.
        System.out.println(primaParamtreVracaVrijednost(100));
        System.out.println(primaParamtreVracaVrijednost(50));
        
    }
    
    private void nePrimaParametreNeVracaVrijednost(){
        System.out.println("NK Osijek");
    }
    
    private void primaParametreNeVracaVrijednost(int i){
        System.out.println("Primio " + i);
    }
     private void primaParametreNeVracaVrijednost(int i, int j){
        System.out.println("Primio " + i + " i " + j);
    }
     
     private int nePrimaParamtreVracaVrijednost(){
         int i = (int)(Math.random()*100);
         return i;
     }
     
     private int primaParamtreVracaVrijednost(int mnozitelj){
         int i = (int)(Math.random()*mnozitelj);
         return i;
     }
    
    public static void main(String[] args) {
        new RadSMetodama();
    }
}
