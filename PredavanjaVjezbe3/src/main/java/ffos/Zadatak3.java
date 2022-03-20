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
public class Zadatak3 {
    
    //za unesena dva cijela broja
    //program ispisuje zbroj
    //svih parnih brojeva između
    //unesenih vrijednosti
    
    //8 i 12 : 30
    //13 i 5 : 36
    
    public static void main(String[] args) {
        int i=8;
        int j=12;
        
        int min = i<j ? i : j;
        int max = i>j ? i : j;
        int suma = 0;
        for(int t=min;t<=max;t++){
            if(t%2==0){
                suma+=t;
            }
        }
        System.out.println(suma);
    }
}
