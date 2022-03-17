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
public class UvjetnoGrananjeIf {
    public static void main(String[] args) {
        
        boolean uvjet = true;
        
        if(uvjet){
            System.out.println("Hello");
        }
     
        boolean prolaz = 3 < 2;
        
        if(prolaz){
            System.out.println("Osijek");
        }
    
        int i = 2;
        if(i<3){
            System.out.println("IKI");
        }
        
        if(i>2 && i<10){
            System.out.println("OK");            
        }else{
            System.out.println("NE");
        }
        
        if(i==2){
            System.out.println("dovoljan");
        }else if(i==3){
            System.out.println("dobar");
        }else{
            System.out.println("Nije bilo veće ocjene");
        }
   //loša praksa
        if(i==2)
            System.out.println("Dovoljan");
        else
            System.out.println("Ostalo");
            System.out.println("Osijek");
           
       if(i==2){
           System.out.println("OK");
       } else {
           System.out.println("Ne");
       }
       // zadnja verzija if naredbe - inline if
        System.out.println(i==2 ? "OK" : "Ne");
    }
}
