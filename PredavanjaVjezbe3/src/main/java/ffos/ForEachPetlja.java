/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

/**
 *
 * @author Korisnik
 */
public class ForEachPetlja {
    public static void main(String[] args) {
        
        int[] niz = {2,3,3,4,5,6,7};
        
        for(int i=0;i<niz.length;i++){
            System.out.println(niz[i]);
        }
        
        for(int i:niz){
            System.out.println(i);
        }
    }
}
