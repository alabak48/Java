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
public class WhilePetlja {
    public static void main(String[] args) {
        boolean uvjet = true;
        int i=1;
        while(uvjet){
            System.out.println(i);
            uvjet = ++i<10;
        }
        
        i=0;
        while(i<10){
        System.out.println(i++);
    }
        
        //continue i break jednako kao u for
        
        //beskonačna petlja
        while(true){
            break;
            //bez break je beskonačna
        }
        
    }
}
