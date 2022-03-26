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
public class ParniBrojeviWhile {
    public static void main(String[] args) {
                boolean uvjet = true;
        int i=1;
        while(uvjet){
            System.out.println(i);
            uvjet = ++i<100;
        }
        
        i=0;
        while(i<100){
        System.out.println(i++);
    }
    }
   
}
