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
public class Zadatak2 {
    //Program ispisuje sve parne brojeve
    //od 78 do 23
    
    public static void main(String[] args) {
        
        for(int i=78;i>=23;i--){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
